public class Person {

    public void introduce(String name, String age) {
        System.out.println("Method with two strings!");
        System.out.println("My name is " + name + ". My age is " + age);
    }

    public void introduce(String name, Integer age) {
        System.out.println("Method with a string and a number!");
        System.out.println("My name is " + name + ". My age is " + age);
    }

    public static void main(String[] args) {

        Person victor = new Person();
        victor.introduce("Victor", (String) null);
    }
}