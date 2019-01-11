package com.me.objectapi.Chapter02_10;

public class Enums {

    public static void main(String[] args) {
        MathHelper helper = new MathHelper(100);
        try {
            while (true) {
                int input = helper.addMethod("Enter a number: ",Operation.SUBTRACT);
                int total = helper.getTotal();
                String message = String.format("Entered: %d, total = %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {

            System.out.println("All done!");
        }
    }
}
