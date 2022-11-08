package Qn3.MultiplyWithDifferentArguments;

import java.util.Scanner;

class MathFunction {
    public static void main(String[] args) {                       //Only for testing purpose
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        MathFunction m = new MathFunction();
        System.out.println(m.multiply(a, b));
        System.out.println(m.multiply((int) a, (int) b));
        System.out.println(m.multiply((int) a, b));
    }

    public int multiply(int a, int b) {                             //Multiply with two integer numbers
        return a * b;
    }

    public float multiply(float a, float b) {                       //Multiply with two floating point numbers
        return a * b;
    }

    public float multiply(int a, float b) {                         //Multiply with one integer and a floating point number
        return (float) a * b;
    }
}