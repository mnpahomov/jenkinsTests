package tests;

public class Main {

    public static void main(String[] args) {
        System.out.println("GSD " + gcd(3, 5));
        int[] a = {3, 2, 5, 6, 4};
        System.out.println("O(1) " + o1(a));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            System.out.println("Reminder = " + reminder);
            a = b;
            b = reminder;
        }
        return a;
    }

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
}
