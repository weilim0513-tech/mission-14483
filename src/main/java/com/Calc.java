package com;

public class Calc {
    public static int run(String input) {
        String[] inputs = input.split(" ");
        int result = Integer.parseInt(inputs[0]);

        for (int i = 1; i < inputs.length; i += 2) {
            String operator = inputs[i];
            int operand = Integer.parseInt(inputs[i + 1]);

            switch (operator) {
                case "+":
                    result = add(result, operand);
                    break;
                case "-":
                    result = sub(result, operand);
                    break;
                case "*":
                    result = mul(result, operand);
                    break;
            }
        }
        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
