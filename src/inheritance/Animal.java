package inheritance;

public class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    void sleep() {
        System.out.println(this.name + " Zzz....");
    }
}
