package lesson_8;

public class Cat {
    public static void main(String[] args) {

    }
    String name;
    Integer age;
    String parentname;

    public Cat(String name, Integer age, String parentname){
        this.name = name;
        this.age = age;
        this.parentname = parentname;
    }



    public Cat() {
    }

    // Методы
    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void sayHello(String name, Integer age){
        System.out.println("Hello I'm cat");
        System.out.println("My name is " + name);
        System.out.println("My age is" + age);
        System.out.println("My parentName is Snezhkovic");
    }
     public void sayGoodbye() {
         System.out.println("Goodbye");
         System.out.println("See you tomorrow");
     }

     public int giveMeFive(){
         System.out.println("inside method giveMeFive");
        int a = 5;
         System.out.println("going outside of method giveMeFime");
         return a;
     }

     public double giveMePiNumber(){
        return 3.1415926535;
     }

     public int multiple(int a, int b){
        return a * b;
     }

}


