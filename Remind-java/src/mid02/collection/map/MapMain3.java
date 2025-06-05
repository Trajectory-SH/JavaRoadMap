package mid02.collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("A", 50);
        System.out.println(studentMap);

        //key값이 중복이 안되게 entry 추가하기_01
        if (!studentMap.containsKey("A")) {
            studentMap.put("A", 100);
        }
        System.out.println(studentMap);

        //key값이 중복이 안되게 entry 추가하기_02 -> 메서드 사용
        studentMap.putIfAbsent("A", 30);
        studentMap.putIfAbsent("B", 100);
        System.out.println(studentMap);

    }
}
