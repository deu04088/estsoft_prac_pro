package prac_ch7_1;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("야옹");
    }
}
