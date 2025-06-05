package mid02.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

        //같은 키에 저장시 덮어쓰기
        studentMap.put("A", 100);
        System.out.println(studentMap);

        //key값은 HashSet과 같은 자료 구조들로 이루어져 있기 때문에 검색 시간 복잡도 O(1)
        //해시 알고리즘 작동
        boolean result = studentMap.containsKey("A");
        System.out.println("result = " + result);

        //특정 학생의 값 삭제
        studentMap.remove("A");
        System.out.println(studentMap);

    }
}
