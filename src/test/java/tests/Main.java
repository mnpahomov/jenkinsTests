package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.*;
import static java.lang.String.format;

/**
 * @author maxim
 */

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("GSD " + gcd(3, 5));
        int[] a = {3, 2, 5, 6, 4};
        System.out.println("O(1) " + o1(a));
        System.out.println("Find Factors " + findFactors(1357));

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println((char) ('a' + 4));
        System.out.println("arg[0] " + args[2]);
        System.out.println(sqrt(2) * sqrt(2));
        int x = 2;
        x = x * x;
        x = x * x;
        System.out.println("x " + x);
        System.out.println("span " + randomSpan(parseInt(args[0]), parseInt(args[1])));
        System.out.println("abs " + abs(-2));
        test();
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(format("test string %.2s format %-30.2f de", "11rtyui", 113.0));
        System.out.printf("test %s", "super\n");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String df = bufferedReader.readLine();
//        System.out.println(df);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine());
    }

    /**
     * My first method javadoc comment
     * @param a Number A
     * @param b NumberB
     * @return Return GCD
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            System.out.println("Reminder = " + reminder);
            a = b;
            b = reminder;
        }
        return a;
    }

    /**
     * Method find half number
     * @param array Array test numbers
     * @return Return half number
     */
    public static int o1(int[] array) {
        int first = array[0];
        int lastIndex = array.length - 1;
        int last = array[lastIndex];
        int half = array[lastIndex / 2];
        System.out.println("Half " + half);

        if (first < last && first > half) {
            return first;
        } else if (last > first && last < half) {
            return last;
        }
        return half;
    }

    public static List<Integer> findFactors(int number) {
        System.out.println("Numder: " + number);
        List<Integer> factors = new ArrayList<Integer>();
        while (number % 2 == 0) {
            factors.add(2);
            number = number/2;
        }
        int i = 3;
        int maxFactor = (int) sqrt(number);
        while (i <= maxFactor) {
            while (number % i == 0) {
                factors.add(i);
                number = number/i;
                maxFactor = (int) sqrt(number);
            }
            i = i + 2;
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }

    public static int randomSpan(int a, int b) {
        int min = min(a, b);
        int max = max(a, b);
        int y = max - min;
        double r = random();
        return min + ((int)(r * (y + 1)));
    }

    public static void test() {
        for (int i = 0, j = 0; i < 10; i++) {
            j += j;
            System.out.println("i " + i + ", j " + j);
        }
    }
}
