package tests;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxim
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("GSD " + gcd(3, 5));
        int[] a = {3, 2, 5, 6, 4};
        System.out.println("O(1) " + o1(a));
        System.out.println("Find Factors " + findFactors(1357));
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
        int maxFactor = (int) Math.sqrt(number);
        while (i <= maxFactor) {
            while (number % i == 0) {
                factors.add(i);
                number = number/i;
                maxFactor = (int) Math.sqrt(number);
            }
            i = i + 2;
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }
}
