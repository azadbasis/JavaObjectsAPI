package com.me.objectapi.Chapter02_06;

import java.util.Scanner;

public class InputHelper {

      String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
