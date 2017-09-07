package com.qiao.weixin.algorithms.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/9/7 14:13
 */
public class MethodAsParam {
    public static List<Thing> filterThings(List<Thing> inventory, Predicate<Thing> p){
        List<Thing> result=new ArrayList<>();
        for(Thing thing:inventory){
            if(p.test(thing))
                result.add(thing);
        }
        return result;
    }

    public static boolean testSizeBig(Thing thing){
        return thing.getSize()>5;
    }


    public static void main(String[] args){
        Thing thing=new Thing(6,"red");
        List<Thing> things=new ArrayList<>();
        for(int i=1;i<7;i++){
            things.add(new Thing(i,"blue"));
        }
//        things=filterThings(things,MethodAsParam::testSizeBig);
        things=filterThings(things,(Thing a)->a.getColor().equals("red"));
        List<Thing> blueThings=things.stream().filter((Thing t)->t.getColor().equals("blue"))
                                                .collect(Collectors.toList());
        List<Thing> parallelThings=things.parallelStream().filter((Thing t)->t.getSize()<5)
                                                            .collect(Collectors.toList());

    }
}
