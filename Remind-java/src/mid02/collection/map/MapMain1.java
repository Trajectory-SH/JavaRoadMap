package mid02.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("A", 90);
        studentMap.put("B", 80);
        studentMap.put("C", 80);
        studentMap.put("D", 100);

        //key = value 가 출력되도록 toString이 Overriding이 되어있다.
        System.out.println(studentMap);


        //Key 값을 가지고 해당 Key 값에 해당하는 value를 return해준다.
        Integer result = studentMap.get("D");
        System.out.println("result = " + result);
        //맵의 키들을 Set 형태로 Return한다.
        System.out.println("KeySet 활용");
        //인스턴스로 HashMap 멤버 메서드에 접근
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            //key값에 대응하는 value를 return해준다.
            Integer value = studentMap.get(key);
            System.out.println("key = " + key+" ,value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        System.out.println(values.getClass());
    }
}
