package lesson_5;

import java.util.Scanner;

public class HW_5_Task7 {

    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);;
        int[] array7 = new int[20];
        for (int i = 0; i < 20; i++) {
            array7[i] = sc7.nextInt();
        }
        for (int x : array7) {
            System.out.println(x);
        }
    }
    public static void bubbleSort(int[] array7) {
        for (int i = 0; i < array7.length; i++)
            for (int j = i + 1; j < array7.length; j++)
                if (array7[j] > array7[i]) {
                    int sortirovka = array7[i];
                    array7[i] = array7[j];
                    array7[j] = sortirovka;
                }
    }
}

