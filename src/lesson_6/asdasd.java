package lesson_6;

import java.util.Scanner;

public class asdasd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] st5 = new String[6];
        for (int i = 0; i < st5.length; i++) {
            st5[i] = scanner.nextLine();
        }
        for (int i = 0; i < st5.length; i++) {
            for (int j = 0; j < st5.length; j++) {
                if (st5[i] == null || st5[j] == null) {
                    if (i == j) {
                        if (st5[i].equals(st5[j])) {
                            st5[i] = null;
                            st5[j] = null;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < st5.length; i++) {
            System.out.println(st5[i] + ", ");


        }
    }
}


//        System.out.println("Minimal string " + min);



//    int[] array2 = new int[10];
//        for (int i = 0; i < 10; i++) {
//        array2[i] = sc.nextInt();
//        }
//        int maximum = array2[0];
//
//        for (int i = 1; i < 10; i++) {
//        if (array2[i] > maximum)
//        maximum = array2[i];
//        }
//        System.out.println(maximum);