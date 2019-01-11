package com.me.objectapi.Chapter02_07;


public class InstanceVariables {
    public static void main(String[] args) {

           MathHelper helper = new MathHelper();
        try {
            while (true){
                int input=helper.addMethod("Enter a number: ");
                int total=helper.getTotal();
                String message=String.format("Entered: %d, total = %d",input,total);
                System.out.println(message);
            }
        } catch (NumberFormatException e) {

            System.out.println("All done!");
        }

    }
}
