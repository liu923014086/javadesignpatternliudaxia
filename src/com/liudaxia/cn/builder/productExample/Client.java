package com.liudaxia.cn.builder.productExample;

/**
 * 建造者模式
 */
public class Client {
    public static void main(String[]args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
        System.out.println(product.getPart3());
    }
}