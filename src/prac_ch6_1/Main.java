package prac_ch6_1;

class Book {
    private String name;
    private String author;
    private int price;

    Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = Math.max(price, 0);
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Author: " + author + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", 35000);
        Book book2 = new Book("Clean Code", "로버트 마틴", -10000);

        book1.printInfo();
        book2.printInfo();
    }
}
