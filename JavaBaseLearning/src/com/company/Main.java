package com.company;

import classLearning.Animal;
import classLearning.Cat;
import classLearning.Shark;
import classLearning.TestClass;

import java.util.Arrays;

//enum myType{
//    Small,
//    Mid,
//    Large
//}

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");

        //基本数据类型大小
        //printBaseTypeSize();

        //
        //practise();

        //数组
        //ArrayTest();

        //类
        classTest();

        System.out.println("End");

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

    public static void practise() {
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
        //System.out.println("myType =  " + myType.Large);

        //控制流程
        for(int i = 0;i<10;i++)
        {
            if(i%2 == 0)
                System.out.println("i =  " + i);
        }
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

    public static void classTest(){
//        TestClass a = new TestClass();
//        TestClass b = new TestClass("a",99);
//
//        b = a;
//        a.setM_val(998);
//
//        a.printTestClass();
//        b.printTestClass();

        Animal tom = new Cat("Tom",4);
        tom.eat();
        tom.move();
        tom.getAge();
        tom.getClassName();
        ((Cat)tom).getFurColor();

        Animal sk = new Shark("Shark-O",13);
        sk.eat();
        sk.move();
        sk.getAge();
        sk.getClassName();
        ((Shark)sk).getBodyLength();

        //这里出现classLearning.Cat cannot be cast to classLearning.Shark
        //类型强转调用方法出错，这里是否有安全检查语句？

        if(tom instanceof Shark)
        {
            Shark tempAnimal = (Shark)tom;
            tempAnimal.getBodyLength();
        }
        else
        {
            System.out.print("tom is not instanceof Shark!");
        }

        
    }

}
