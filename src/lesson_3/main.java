/**Логические операторы

     && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
     || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
     ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
     Если условие имеет значение true, то оператор логического «НЕ» будет делать false*/
    /**if (условие) {
     //действие(-я), которые выполняются, если условие истинно;
     }
     else if (условие) {
     //действие(-я), которые выполняются, если условие истинно;
     }
     else if (условие) {
     //действие(-я), которые выполняются, если условие истинно;
     }
     else {
     //действие(-я), которые выполняются, если условие истинно;
     }*/
    /**switch (ВыражениеДляВыбора) {
     case (Значение1):
     Код1;
     break;
     case (Значение2):
     Код2;
     break;
     ...
     case (ЗначениеN):
     КодN;
     break;
     default:
     КодВыбораПоУмолчанию;
     break;
     }*/
package lesson_3;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // int x = scan.nextInt();
       // if (x < 5) {
       //     System.out.println("Число меньше 5");
       // }
       // else if (x > 5) {
       //     System.out.println("Число больше 5");
       // }
       // else {
        //    System.out.println("Число равно 5");
       // }


       // int y = 60;
       // if (y > 50 && y < 100 ) {
       //     System.out.println("Число " + y + " содержится в интервале");
       // }
       // else {
       //     System.out.println("Число " + y + " не содержится в интервале");
       // }


       //  Scanner scan = new Scanner(System.in);
        // int year = scan.nextInt();
       // if ( year % 400 == 0 && year % 4 == 0 ) {
        //    System.out.println("Количество дней в этом году : 366");
        //}
        //else if ( year % 100 == 0 && year % 400 != 0 ) {
         //   System.out.println("Количество дней в этом году : 365");
        //}
       // else {
         //   System.out.println("Количество дней в этом году : 365");
        //}

        //Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
        //int b = scan.nextInt();
        //int c = scan.nextInt();
        //if ( a + b > c && a + c > b && b + c > a ) {
        //    System.out.println("Треугольник существует.");
        //}
        //else {
        //    System.out.println("Треугольник не существует.");
        //}

        //Scanner scan = new Scanner(System.in);
        //double t = scan.nextInt();
       // t = t % 5;

        //if ( t  >= 0 && t < 3 ) {
       //     System.out.println("зелёный");
       // }
      //  else if ( t  >= 3 && t < 4) {
       //     System.out.println("жёлтый");
       // }
       // else if ( t  >= 4 && t < 5) {
        //    System.out.println("красный");
       // }
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ( year % 400 == 0 ) {
            System.out.println("Количество дней в этом году : 366");
        }
        else if ( year % 100 == 0 ) {
            System.out.println("Количество дней в этом году : 365");
        }
        else if ( year % 4 == 0 ) {
            System.out.println("Количество дней в этом году : 366");
        }
        else {
            System.out.println("Количество дней в этом году : 365");
        }
















    }

}
