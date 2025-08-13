import java.util.Scanner;

public class Car {
    String company;
    String model;
    int maxSpeed;

    void setModel(String model) {
        this.model = model;
    }

    Car() {}

    Car(String company) {
        this.company = company;
    }

    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }
    Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        Car first_car = new Car("현대자동차");
        Car second_car = new Car("기아자동차", "차종모르는데");
        Car third_car = new Car("페라리", "페라리", 200);

        Car sonata = new Car();
        sonata.setModel("sonata");

        System.out.println(first_car.company);
        System.out.println(second_car.company + " " + second_car.model);
        System.out.println(third_car.company + " " + third_car.model + " " + third_car.maxSpeed );
        System.out.println(sonata.model);

    }
}
