package lesson_6;

import java.util.Scanner;

public class Task {
    public static void main (String[] args){
        // Task 1. Revers text
        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        char[] chars = text.toCharArray();
//        String revers = "";
//
//        for (int i = text.length() - 1; i >= 0; i--) {
//            revers += chars[i];
//
//        }
//        System.out.println(revers);

            // Task 2. Check email of user
            String email = sc.nextLine();
            char[] chars = email.toCharArray();

            for (int i = 0; i < chars.length ; i++) {
//                System.out.println(chars[i]);
                if ('@' != chars[i]) {
                    System.out.println("YDH@");
                    return;
                }


        }

    }
}
