import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 80);
        map.put("카리나", 85);
        map.put("제시카", 95);
        map.put("홍길동", 83);      // 키가 값기 때문에 가장 마지막에 저장한 값으로 저장
        System.out.println("총 Entry 수: " + map.size());

        System.out.println("\t홍길동: " + map.get("홍길동"));    // 마지막으로 저장한 홍길동 값 출력
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수: "  + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }
}
