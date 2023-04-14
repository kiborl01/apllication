package lesson_6;

import java.util.Objects;
import java.util.Scanner;

public class HW_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String st = s.toUpperCase();
        System.out.println(st);

        String s1 = scanner.nextLine();
        int st1 = s1.length();
        if (st1 % 2 == 0) {
            System.out.println(s1 + " " + s1);
        } else {
            System.out.println(s1 + " " + s1 + " " + s1);

        }
        System.out.println("----------------------------------------");
        System.out.println("Задача 2");

        int max = 0;
        int min = 0;
        String[] st2 = new String[5];
        for (int i = 0; i < 5; i++) {
            st2[i] = scanner.nextLine();
            if (st2[i].length() <= st2[min].length())
                min = i;
            if (st2[i].length() >= st2[max].length())
                max = i;
        }
        System.out.println(st2[min]);
        System.out.println(st2[min].length());
        System.out.println(st2[max]);
        System.out.println(st2[max].length());



        System.out.println("----------------------------------------");
        System.out.println("Задача 3");

        String[] st3 = new String[10];

        for (int i = 0; i < 8; i++) {
            st3[i] = scanner.nextLine();
        }
        for (int j = st3.length - 1; j >= 0; j--) {
            System.out.println(st3[j]);
        }

        System.out.println("----------------------------------------");
        System.out.println("Задача 4");

        String[] srt = new String[10];
        int[] array4 = new int[10];

        for (int i = 0; i < srt.length; i++) {
            String s4 = scanner.nextLine();
            srt[i] = s4;
            array4[i] = srt[i].length();
        }
        for (int j = 0; j < array4.length; j++) {

            System.out.println(array4[j]);
        }

        System.out.println("----------------------------------------");
        System.out.println("Задача 5");

        String[] st5 = new String[6];

        for (int i = 0; i < st5.length; i++) {
            st5[i] = scanner.nextLine();
        }

        for (int i = 1; i < st5.length; i++) {
            String str5 = st5[i];
            for (int j = 0; j < st5.length; j++) {
                if(i != j && str5 != null){
                    if (str5.equals(st5[j])){
                        st5[i] = null;
                        st5[j] = null;
                }
            }
        }
    }

        for (String str5: st5) {
            System.out.println(str5);
        }

        }
}








