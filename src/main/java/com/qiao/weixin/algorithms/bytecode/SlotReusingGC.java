package com.qiao.weixin.algorithms.bytecode;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/6 21:37
 */
public class SlotReusingGC {
    public static void main(String[] args){
        byte[] holder=new byte[64*1024*1024];
        System.gc();
    }
}
