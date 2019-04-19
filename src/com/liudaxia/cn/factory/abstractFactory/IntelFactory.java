package com.liudaxia.cn.factory.abstractFactory;

import com.liudaxia.cn.factory.simpleFactory.Cpu;
import com.liudaxia.cn.factory.simpleFactory.IntelCpu;
import com.liudaxia.cn.factory.simpleFactory.IntelMainboard;
import com.liudaxia.cn.factory.simpleFactory.Mainboard;

public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }

}