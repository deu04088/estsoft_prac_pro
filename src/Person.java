public class Person {
    final String nation = "Korea";
    String name;

    public Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person person = new Person("계백");

        System.out.println(person.nation);
        System.out.println(person.name);

//        person.nation = "을지문덕";   // Error:
    }
}
