package oop;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public static void aboutClass(Object o){
        Class clazz = o.getClass();
        System.out.println(clazz);
        System.out.println("Column: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Parents class: " + clazz.getSuperclass());
        System.out.println("Methods: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Constructor: " + Arrays.toString(clazz.getConstructors()));
    }



}
