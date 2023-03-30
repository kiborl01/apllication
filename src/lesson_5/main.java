package lesson_5;

import java.util.Scanner;

public class main {

    //    public static void main(String[] args) {
//        //System.out.println("println"); /// + перенос корретки на след обзац
//        //System.out.print("print");//+ без переноса корретки на след обзац
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.printf("My name is %s",name );
//        int age = scanner.nextInt();
//        System.out.printf("My age is %d", age);
//
//
//
//    }
//}
    public static void main(String[] args) {


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
