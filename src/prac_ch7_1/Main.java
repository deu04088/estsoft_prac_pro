package prac_ch7_1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("바둑이");
        Animal cat = new Cat("나비");

        dog.makeSound();
        cat.makeSound();
    }
}
