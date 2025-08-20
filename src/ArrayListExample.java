import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        int size = list.size();
        System.out.println("Size of list is: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("Skill 2: "  + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);     // 인덱스 2번 삭제 후 재정렬
        list.remove(2);     // 인덱스 2번 삭제 후 재정렬
        list.remove("Java");   // Java 값 삭제

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
    }
}
