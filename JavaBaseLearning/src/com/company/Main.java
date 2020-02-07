package com.company;

import java.util.Arrays;

enum myType{
    Small,
    Mid,
    Large
}

public class Main {
    public static void main(String[] args) {

        System.out.println("hello,World");

        //基本数据类型大小
        printBaseTypeSize();

        //变量声明后必须初始化才能使用!
        int value = 100;
        System.out.println("value = " + value);

        //常量
        final double dvalue = 99.9;
        //dvalue = 100.1; //Error!!!
        System.out.println("final dvalue = " + dvalue);


        //数值转换
        int n = 1234556;
        float f = n;
        System.out.println("f = " + f);

        //枚举
        System.out.println("myType =  " + myType.Large);

        //控制流程
        for(int i = 0;i<10;i++)
        {
            if(i%2 == 0)
                System.out.println("i =  " + i);
        }

        //数组
        ArrayTest();
    }

    public static void printBaseTypeSize() {
        System.out.println("Int: " + Integer.SIZE/8);               // 4
        System.out.println("Short: " + Short.SIZE/8);               // 2
        System.out.println("Long: " + Long.SIZE/8);                 // 8
        System.out.println("Byte: " + Byte.SIZE/8);                 // 1
        System.out.println("Char: " + Character.SIZE/8);            // 2
        System.out.println("Float: " + Float.SIZE/8);               // 4
        System.out.println("Double: " + Double.SIZE/8);             // 8

    }

    public static void ArrayTest() {
        int array[] = new int[100];
        for(int i=0;i<100;i++)
            array[i] = i;

        //数组初始化
        int initArray[] = {1,3,5,67,87,8,99,43};

        int[] copiedLuckyNumbers = Arrays.copyOf(initArray,initArray.length);

        System.out.println("print copyArray");
        for (int var : copiedLuckyNumbers)
            System.out.print(var + " ");

        System.out.println("end");
    }
}
