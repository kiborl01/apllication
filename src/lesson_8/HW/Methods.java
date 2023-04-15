package lesson_8.HW;

import java.util.Scanner;

public class Methods {
    //Task 1.
    int inCube;

    public void cube(int a) {
        inCube = a * a * a;
        System.out.println(inCube);
    }

    // Task 2.
    boolean b;

    public boolean trueFalse(int c) {
        return b = c > 5;
    }

    public void trueOFalse() {
        System.out.println(b);
    }

    // Task 3.
    public int theSmallest(int x, int y) {
        if (x < y) {
            System.out.println(x);
            return x;
        } else {
            System.out.println(y);
            return y;
        }
    }
    // Task 4.

    int i;
    int j;
    int k;

    public void indegree(int v, int w) {
        i = v * v;
        j = w * w;
        k = i + j;
        System.out.println(k);
    }

    //Task 5.

    char operation;
    int num1;
    int num2;
    double result;

    public int getInta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число :");
        num1 = sc.nextInt();
        return num1;
    }
    public int getIntb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите второе число :");
        num2 = sc.nextInt();
        return num2;
    }

    public char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак (+, -, * , /) : ");
        operation = sc.next().charAt(0);
        return operation;
    }

    public int calc() {

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 * 1.0/ num2;
                break;
            default:
                System.out.println("Не корректная операция");
        }
        System.out.print("Результат операции: ");
        System.out.println(result);
        return (int) result;
    }

}




