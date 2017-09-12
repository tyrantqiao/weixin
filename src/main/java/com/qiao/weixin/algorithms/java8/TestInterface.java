package com.qiao.weixin.algorithms.java8;

import com.sun.javafx.collections.MappingChange;
import org.aspectj.weaver.ast.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/9 21:15
 */
public class TestInterface {

//    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
//        List<R> result=new ArrayList<>();
//        for(T t:list){
//            result.add(f.apply(t));
//        }
//        return result;
//    }
//    TestInterface(int i) {
//
//    }


    public static void main(String[] args){
        //s.length() == String::length
//        List<Integer> list=map(Arrays.asList("1","2"), String::length);
//        for(Integer i:list){
//            System.out.println(i);
//        }
//        IntFunction<TestInterface> intFunction= com.qiao.weixin.algorithms.java8.TestInterface::new;

        List<String> words= Arrays.asList("hello","world");
        List<Integer> word= new ArrayList<>();
        word=words.stream()
                .map(String::length)
                .collect(Collectors.toList());

    }
}
