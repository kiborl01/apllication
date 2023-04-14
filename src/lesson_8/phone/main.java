package lesson_8.phone;

public class main {
    public static void main(String[] args) {
        Contact vasya = new Contact("Vasiliy", "89155129223", "test@mail.ru");
        Contact Sanya = new Contact("Sanya", "89155129485", "test2@mail.ru");
        Contact Dima = new Contact("Dima", "89155129263", "test3@mail.ru");
        Contact Artem = new Contact("Artem", "89155129293", "test4@mail.ru");
        Contact Kolya = new Contact("Kolya", "89155129103", "test5@mail.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(Sanya);
        phoneBook.addContact(Dima);
        phoneBook.addContact(Artem);
        phoneBook.addContact(Kolya);
    }
}
