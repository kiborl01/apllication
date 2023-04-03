package lesson_5;

import java.util.Scanner;

public class hh {
    public static void main(String[] args) {


        Scanner sc2 = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc2.nextInt();
        }
        int maximum = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
        System.out.println(maximum);
    }
}
