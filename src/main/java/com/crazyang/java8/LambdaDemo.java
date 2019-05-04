package com.crazyang.java8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName LambdaDemo
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/4 下午3:17.
 */

public class LambdaDemo {


    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
        //指定输出类型
        Arrays.asList("b", "d", "e").forEach((String e) -> System.out.println(e));
        //如果是复杂的语句块
        Arrays.asList("d", "f", "g").forEach((String e) -> {
            System.out.println("输出开始");
            System.out.println(e);
        });

        //局部变量的使用
        final String separator = ",";
        Arrays.asList("j", "g", "m").forEach(e -> System.out.println(e + separator));


       Arrays.asList("a","b","c","d").sort((String e1,String e2)->e1.compareTo(e2));

       Arrays.asList("a","b","c","d").sort((String e1,String e2)->{
           int result = e1.compareTo(e2);
           System.out.println(result);
           return result;
       });
    }
}
