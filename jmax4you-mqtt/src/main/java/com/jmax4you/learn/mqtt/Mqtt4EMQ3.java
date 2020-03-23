package com.jmax4you.learn.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * @author max.zheng
 * @date 2020-03-19 15:38
 */
public class Mqtt4EMQ3 {

    static String clientId = "client-3";
    static String username = "admin";
    static String password = "123456";

    public static void main(String[] args) {
        // 共享订阅
        String topic = "$share/group1/maxTopic";
        String content = "Message from MqttPublishSample";
        int qos = 0;
        String broker = "tcp://192.168.200.176:1883";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);

            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(false);
//            connOpts.setUserName(username);
//            connOpts.setPassword(password.toCharArray());
            System.out.println("Connecting to broker: " + broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");
            sampleClient.setCallback(new EMQDataCallBack2());
            sampleClient.subscribe(topic, qos);

            Thread.sleep(Long.MAX_VALUE);

            // BufferedInputStream bis = new BufferedInputStream(System.in);
            // System.out.println("请输入发送内容：");
            // System.out.println("Publishing message: " + content);
            // MqttMessage message = new MqttMessage(content.getBytes());
            // message.setQos(qos);
            // sampleClient.publish(topic, message);
            // System.out.println("Message published");
            // sampleClient.disconnect();
            // System.out.println("Disconnected");
            // System.exit(0);
        } catch (MqttException me) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class EMQDataCallBack3 implements MqttCallback {
    @Override
    public void connectionLost(Throwable cause) {
        System.out.println(cause.getMessage());
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println(topic);
        System.out.println(new String(message.getPayload(), "UTF-8"));
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }
}

//        ConnectCommand为连接操作类，可以设置相应属性。
//
//        setClientId()
//
//        设置客户身份唯一标识
//
//        setServer()
//
//        设置建立连接的域名或者服务器ip
//
//        setPort
//
//        设置端口号
//
//        setUserNameAndPassword
//
//        设置连接认证的用户名和密码
//
//        setKeepAlive
//
//        设置保持长连接ping的频率，单位为秒，建议100
//
//        setTimeout
//
//        设置操作超时时间。
//
//        setCleanSession
//
//        设置cleansession，若为true，当 disconnect 时,会移除这个 client 所有的 subscriptions.
//
//        setSsl
//
//        建立ssl长连接，若没有设置的话，默认为tcp长连接。
//
//        setLastWill
//
//        设置遗愿消息，即当设备断开连接时会主动pub的消息。
//
//        setTraceEnabled
//
//        是否打印日志，默认false
//
//        setTraceCallback
//
//        监听日志回调，需要setTraceEnabled（true）

