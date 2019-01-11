package com.me.objectapi.Chapter02_10;

public class MathHelper {



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

    public int addMethod(String prompt, Operation operation) throws NumberFormatException {
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
