package lesson_4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {


        System.out.println("Задача 1");

        Scanner sc4 = new Scanner(System.in);
        int m = sc4.nextInt();
        int n = sc4.nextInt();
        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------------");
        System.out.println("Задача 2");

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задача 3");


        int x = sc4.nextInt();
        int y = sc4.nextInt();
        int z = sc4.nextInt();
        for (int i = 0; i < 1; i++) {
            if ((x < y && x > z) || (x > y && x < z)) {
                System.out.println(x);
            } else if ((y < x && y > z) || (y > x && y < z)) {
                System.out.println(y);
            } else if ((z < x && z > y) || (z > x && z < y)) {
                System.out.println(z);
            } else if (z == x || z == y || x == y) {
                System.out.println(x);
            }
            System.out.println("-------------------------------------------");
            System.out.println("Задача 4");


            for (int k = 0; k < 1; k++) {
                int tb = 0;

                while (tb < 1) {
                    System.out.println("1 2 3 4 5 6 7 8 9 10");
                    tb++;
                }
                while (tb < 2) {
                    System.out.println("11 12 13 14 15 16 17 18 19 20");
                    tb++;
                }
                while (tb < 3) {
                    System.out.println("21 22 23 24 25 26 27 28 29 30");
                    tb++;
                }
                while (tb < 4) {
                    System.out.println("31 32 33 34 35 36 37 38 39 40");
                    tb++;
                }
                while (tb < 5) {
                    System.out.println("41 42 43 44 45 46 47 48 49 50");
                    tb++;
                }
                while (tb < 6) {
                    System.out.println("51 52 53 54 55 56 57 58 59 60");
                    tb++;
                }
                while (tb < 7) {
                    System.out.println("61 62 63 64 65 66 67 68 69 70");
                    tb++;
                }
                while (tb < 8) {
                    System.out.println("71 72 73 74 75 76 77 78 79 80");
                    tb++;
                }
                while (tb < 9) {
                    System.out.println("81 82 83 84 85 86 87 88 89 90");
                    tb++;
                }
                while (tb < 10) {
                    System.out.println("91 92 93 94 95 96 97 98 99 10");
                    tb++;
                }
            }
        }

        System.out.println("-------------------------------------------");

        System.out.println("Задача 5");
        Scanner sc5 = new Scanner(System.in);
        String name = sc5.nextLine();
        int day = sc5.nextInt();
        int month = sc5.nextInt();
        int year = sc5.nextInt();
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
        System.out.println("--------------------------------");
    }
}




