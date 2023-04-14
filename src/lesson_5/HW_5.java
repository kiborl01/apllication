package lesson_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HW_5 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String[] st = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            st[i] = sc.nextLine();
        }
        for (int j = st.length - 1; j >= 0; j--) {
            System.out.println(st[j]);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Задача 2");

        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = sc.nextInt();
        }
        int maximum = array2[0];

        for (int i = 1; i < 10; i++) {
            if (array2[i] > maximum)
                maximum = array2[i];
        }
        System.out.println(maximum);

        System.out.println("-----------------------------------------");
        System.out.println("Задача 3");

        String[] srt = new String[10];
        int[] array3 = new int[10];

        for (int i = 0; i < srt.length; i++) {
            String s = sc.nextLine();
            srt[i] = s;
            array3[i] = srt[i].length();
        }
        for (int j = 0; j < array3.length; j++) {

            System.out.println(array3[j]);
        }


        System.out.println("-----------------------------------------");
        System.out.println("Задача 4");

        Scanner sc4 = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc4.nextInt();
        }
        for (int j = n.length - 1; j >= 0; j--) {
            System.out.println(n[j]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Задача 5");

        int[] array5 = new int[20];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = sc.nextInt();
        }
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = array5[i];
            b[i] = array5[i + 10];
            System.out.println(b[i]);
        }


        System.out.println("-----------------------------------------");
        System.out.println("Задача 6");

        int max = 0;
        int min = 0;
        int[] array6 = new int[20];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = sc.nextInt();
            if (min > array6[i]) {
                min = array6[i];
            }
            if (max < array6[i]) {
                max = array6[i];
            }
        }
        System.out.print(max + " " + min);



        System.out.println("-----------------------------------------");
        System.out.println("Задача 7");
        System.out.println("Задача 7 в мейне HW_5_Task7");

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
















