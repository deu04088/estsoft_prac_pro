package prac_ch7_4;

public class ZooSolution {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("-- 점심시간 --");
        zooKeeper.feed(tiger);
        zooKeeper.feed(monkey);

        System.out.println("-- 저녁시간 --");
        Animal[] animals = {tiger, monkey};
        for(int i = 0; i < animals.length; i++) {
            zooKeeper.feed(animals[i]);
        }
    }
}
