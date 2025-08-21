import java.util.HashSet;
import java.util.Set;

class Member2 {
    String name;
    int age;

    public Member2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member2) {
            Member2 member = (Member2) obj;
            return member.name.equals(this.name) && member.age == this.age;
        } else {
            return false;
        }
    }
}

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<Member2> set = new HashSet<>();

        set.add(new Member2("홍길동", 30));
        set.add(new Member2("홍길동", 30));

        System.out.println("총 객체수: " + set.size());
    }
}
