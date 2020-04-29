package com.jmax4you.learn.cmd.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jmax4you.learn.cmd.dto.CmdResult;
import com.jmax4you.learn.cmd.dto.ManualAuthHook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * @author max.zheng
 * @date 2020-04-28 10:29
 */
@Controller
@RequestMapping("/cmd")
public class CmdController {

    @RequestMapping("/getOs")
    @ResponseBody
    public String getOs() {
        //        System.out.println(System.getProperty("os.name"));//Windows 8.1（不准，我的系统是Windows10）
//        System.out.println(System.getProperty("os.version"));//6.3
//        System.out.println(System.getProperty("os.arch"));//amd64
        return System.getProperty("os.name");
    }
    @RequestMapping("/getPath")
    @ResponseBody
    public String getPath() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", "echo $PATH" });
            // 将获取的信息尽可能放入缓冲区
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }finally {
            try {
                process.getOutputStream().close();
            } catch (Exception e) {

            }

//
        }

    }

    @RequestMapping("/exec")
    @ResponseBody
    public String exec() {
        try {
            CmdResult cr = execCmd(new String[] { "/bin/sh", "-c", "cd /jmax/letsencrypt/" },null);
            if (cr.getCode()==0) {
//                System.out.println(cr.getResult());
                cr = execCmd(new String[] { "/bin/sh", "-c", "./certbot-auto certonly --agree-tos --manual-public-ip-logging-ok -d *.code4open.com --email '358744287@qq.com' --manual --preferred-challenges dns --server https://acme-v02.api.letsencrypt.org/directory"},"\n");
//                System.out.println(cr.getResult());
                return cr.getResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return "ok";
    }


    public CmdResult execCmd(String[] cmd,String outStr) throws Exception {
        Process process = Runtime.getRuntime().exec(cmd);
        // 获取执行doc命令后的信息
        InputStream ins = process.getInputStream();
        // 将获取的信息尽可能放入缓冲区
        BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
        String line = null;
        // 读取信息
        // 会先读取缓冲区信息，如果信息不完全才会去读取源数据
        StringBuffer sb = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb.toString());
        // 输出
//        if (outStr!=null) {
//            OutputStream ous = process.getOutputStream();
//            ous.write(outStr.getBytes());
//            ous.flush();
//        }
        // 获取程序返回值   成功为“0”
        int exitVal = process.waitFor();
        return new CmdResult(exitVal,sb.toString());
    }

    @RequestMapping("/hook")
    @ResponseBody
    public String hook(@RequestBody ManualAuthHook manualAuthHook) {
        System.out.println(JSON.toJSON(manualAuthHook));
        return "ok";
    }

}
