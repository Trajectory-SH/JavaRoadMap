package mid02.collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "1000"}, {"Spring", "10000"}, {"JPA", "30000"}};

        HashMap<String, String> productMap = new HashMap<>();
        for (String[] value : productArr) {
            productMap.put(value[0], value[1]);
            //Integer.valueOf(value[1]); -> Return Type : Integer
        }

        for (String key : productMap.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + productMap.get(key));
        }
        System.out.println(productMap);
        System.out.println(productMap.entrySet());
    }

}
