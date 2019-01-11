package com.me.objectapi.Chapter02_06;


public class InstanceMethods {

    public static void main(String[] args) {
        InputHelper helper = new InputHelper();
        String input = helper.getInput("Enter value 1: ");
        System.out.println("You entered: " + input);
        input = helper.getInput("Enter value 2: ");
        System.out.println("You entered: " + input);

    }
}
