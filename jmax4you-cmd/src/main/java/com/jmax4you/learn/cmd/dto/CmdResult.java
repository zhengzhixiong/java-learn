package com.jmax4you.learn.cmd.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author max.zheng
 * @date 2020-04-27 17:40
 */
@Data
@Accessors(chain = true)
public class CmdResult implements Serializable {
    private int code = -1;
    private String result;

    public CmdResult(int code, String result) {
        this.code = code;
        this.result = result;
    }
}
