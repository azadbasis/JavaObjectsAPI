package com.me.objectapi.Chapter02_07;

import java.util.Scanner;

public class InputHelper {

     static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
