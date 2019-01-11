package com.me.objectapi.Chapter02_11;

import static com.me.objectapi.Chapter02_11.MathHelper.Operation.*;

public class NestedTypes {
    public static void main(String[] args) {
        MathHelper helper = new MathHelper(100);
        try {
            while (true) {
                int input = helper.addMethod("Enter a number: ", ADD);
                int total = helper.getTotal();
                String message = String.format("Entered: %d, total = %d", input, total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {

            System.out.println("All done!");
        }
    }
}
