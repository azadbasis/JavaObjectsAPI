package com.me.objectapi.Chapter01_05;

public class CheckedExceptions {

    public static void checkedExceptions() {
        try {
            String welcome = "welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last char: " + lastChar);
            String nothing = null;
            System.out.println(nothing.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception!");
            e.printStackTrace();
            return;
        } catch (NullPointerException e) {
            System.out.println("Null  exception!");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Any Exception");
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doSomething();
        try {
            doAnything();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Code run successfully!");
    }

    public static void doSomething()  {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doAnything() throws InterruptedException {
        Thread.sleep(100);
    }
}
