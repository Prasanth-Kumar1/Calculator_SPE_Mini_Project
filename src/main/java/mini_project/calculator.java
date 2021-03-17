import java.util.*;

import java.io.*;

public class calculator {
    public static double sqRt(double a) {
        return Math.sqrt(a);
    }

    public static double fact(double a) {
        double res = 1;
        for (int i = 2; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static double log(double a) {
        // return Math.log(a);
        double res = 0;
        if (a <= 0) {
            throw new IllegalArgumentException("Log is not defined for negative values.");
        } else {
            res = Math.log(a);
        }
        return res;
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        double x, y, result;
        x = 4;
        y = 6;
        result = sqRt(x);
        System.out.println("The Square Root of given number is: " + result);

        result = fact(x);
        System.out.println("The Factorial of given number is: " + result);

        result = log(x);
        System.out.println("The Natural Logarithm Root of given number is: " + result);

        result = pow(x, y);
        System.out.println("The Power of given number is: " + result);

    }
}
