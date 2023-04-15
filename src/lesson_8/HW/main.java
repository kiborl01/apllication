package lesson_8.HW;

public class main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        Methods number = new Methods();
        number.cube(4);

        System.out.println("--------------------------------");
        System.out.println("Задача 2");

        Methods trueOrFalse = new Methods();
        trueOrFalse.trueFalse(10);
        trueOrFalse.trueOFalse();

        System.out.println("--------------------------------");
        System.out.println("Задача 3");

        Methods smallNumber = new Methods();
        smallNumber.theSmallest(10,8);

        System.out.println("--------------------------------");
        System.out.println("Задача 4");

        Methods summ = new Methods();
        summ.indegree(3,4);

        System.out.println("--------------------------------");
        System.out.println("Задача 5");

        Methods vvod = new Methods();
        vvod.getInta();
        vvod.getIntb();
        vvod.getOperation();
        vvod.calc();
    }

}
