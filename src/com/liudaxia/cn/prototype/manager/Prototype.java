package com.liudaxia.cn.prototype.manager;

public interface Prototype{
    public Prototype clone();
    public String getName();
    public void setName(String name);
}