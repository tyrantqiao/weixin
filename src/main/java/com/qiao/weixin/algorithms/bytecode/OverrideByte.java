package com.qiao.weixin.algorithms.bytecode;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/7 9:53
 */
public class OverrideByte {
    static abstract class Human{
        protected abstract void sayHello();
    }

    static class Man extends Human{
        @Override
        protected void sayHello() {
            System.out.println("man");
        }
    }

    static class Woman extends Human{
        @Override
        protected void sayHello() {
            System.out.println("woman");
        }
    }

    public static void main(String[] args){
        Human man=new Man();
        Human woman=new Woman();
        man.sayHello();
        woman.sayHello();
    }
}
