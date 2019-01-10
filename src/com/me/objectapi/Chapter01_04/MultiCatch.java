package com.me.objectapi.Chapter01_04;

public class MultiCatch {

    public static void multiCatch() {
        try {
            String welcome = "welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length-1];
            System.out.println("Last char: " + lastChar);
            String nothing=null;
            System.out.println(nothing.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception!");
            e.printStackTrace();
            return;
        }catch (NullPointerException e){
            System.out.println("Null  exception!");
            e.printStackTrace();
            return;
        }catch (Exception e){
            System.out.println("Any Exception");
            return;
        }

        System.out.println("Code run successfully!");
    }
}
