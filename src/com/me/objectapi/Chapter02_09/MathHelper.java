package com.me.objectapi.Chapter02_09;

public class MathHelper {

    public static final String ADD = "add";
    public static final String SUBTRACT = "subtract";

    private int total;

    public int getTotal() {
        return total;
    }

    public MathHelper() {
        System.out.println("Constructor called!");
        total = 50;
    }

    public MathHelper(int total) {
        this();
        this.total += total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int addMethod(String prompt, String operation) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);
        switch (operation) {
            case ADD:
                total += value;
                break;
            case SUBTRACT:
                total -= value;
                break;
        }
        return value;
    }

}
