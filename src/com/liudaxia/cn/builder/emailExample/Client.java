package com.liudaxia.cn.builder.emailExample;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);//组织出要发送哪些内容
        director.construct("toAddress@126.com", "fromAddress@126.com");
        
    }

}