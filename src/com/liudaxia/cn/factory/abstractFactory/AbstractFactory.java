package com.liudaxia.cn.factory.abstractFactory;

import com.liudaxia.cn.factory.simpleFactory.Cpu;
import com.liudaxia.cn.factory.simpleFactory.Mainboard;

public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}