package lesson_7.animals;

public class Cat {
    // поля
    String name;
    Integer age;


    // конструктор

    public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Cat(Integer age){
        this.age = 5;
    }

    public Cat(String name) {
        this.name = name;
    }



    public Cat() {
    }
}
