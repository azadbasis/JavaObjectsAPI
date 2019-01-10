package com.me.objectapi.Chapter01_01;

public class Exceptions {

    public static void exception(){
//        String s="Exception";
//        int s=10;
        char[]chars={'W','E','L','C','O','M','E'};
        char c=chars[chars.length-1];
//        char c=chars[chars.length];
        System.out.println(c);
        String nothing=null;
        System.out.println(nothing);
        System.out.println(nothing.length());
    }
}
