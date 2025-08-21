import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("spring", "qwer");
        map.put("summer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.print("아이디: ");
            String id = sc.nextLine();

            System.out.print("비밀번호: ");
            String password = sc.nextLine();
            System.out.println();

            String actual = map.get(id);
            if (actual != null && actual.equals(password)) {
                System.out.println("로그인이 되었습니다");
                break;
            } else if (actual != null) {
                System.out.println("비밀번호가 일치하지 않습니다!");
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다!\n");
            }
        }
    }

}
