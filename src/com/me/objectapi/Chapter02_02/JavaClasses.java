package com.me.objectapi.Chapter02_02;

import java.util.Scanner;

public class JavaClasses {
    public static void main(String[] args) {
        System.out.print("Enter a value:");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println("You entered: "+input);
    }
}
