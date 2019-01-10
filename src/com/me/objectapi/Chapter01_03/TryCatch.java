package com.me.objectapi.Chapter01_03;

public class TryCatch {

    public static void tryCatch() {
        try {
            String welcome = "welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length-1];
            System.out.println("Last char: " + lastChar);
            String nothing=null;
            System.out.println(nothing.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Code run successfully!");
    }

}
