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
            if (email.indexOf('@')== -1){
                System.out.println("Your email is not correct");
                return;
            }

//            String text = "Hello World";
//            int w = text.indexOf('W');
//            System.out.println();





            //Task 3 Check that '@' is only one

        String[] split = email.split("@");

        if (split.length !=2 ) {
            System.out.println("Your email is not correct. 2 '@'");
            return;
        }

        String partBeforeDog = split[0];
        String partAfterDog = split[1];

        if (partBeforeDog.startsWith(".") || partBeforeDog.endsWith(".")){
            System.out.println("Your email is mot correct. Too many points");
            return;
        }
        if (partAfterDog.startsWith(".") || partAfterDog.endsWith(".")){
            System.out.println("Your email is mot correct");
        } return;




}
}
