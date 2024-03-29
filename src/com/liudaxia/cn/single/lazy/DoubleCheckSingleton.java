package com.liudaxia.cn.single.lazy;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance = null;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (DoubleCheckSingleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}