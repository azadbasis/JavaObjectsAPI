package com.me.objectapi.Chapter02_07;

public class MathHelper {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int addMethod(String prompt) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);
        total += value;
        return value;
    }

}
