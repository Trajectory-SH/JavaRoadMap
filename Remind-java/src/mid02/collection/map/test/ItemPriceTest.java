package mid02.collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> result = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (map.get(key) == 1000) {
                result.add(key);
            }
        }
        System.out.println(result);
    }
}
