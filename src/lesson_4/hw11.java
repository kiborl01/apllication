package lesson_4;

import java.util.Scanner;

public class hw11 {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        int m = sc4.nextInt();
        int n = sc4.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.print("" + " \n ");
        }
    }
}

  //      }
//    }
//}

