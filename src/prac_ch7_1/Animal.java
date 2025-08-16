package prac_ch7_1;

public abstract class Animal {
    protected String name;

    Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();
}
