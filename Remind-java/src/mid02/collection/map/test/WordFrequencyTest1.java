package mid02.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordFrequencyTest1 {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";
        String[] textToArray = text.split(" ");
        HashSet<String> key = textToArray(text);
        HashMap<String, Integer> result = makeHashMapResult(key, textToArray);


        System.out.println(result);


    }

    private static HashMap<String,Integer> makeHashMapResult(HashSet<String> key, String[] targetArray) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String fruitKey : key) {
            int count = 0;
            for (String fruit : targetArray) {
                if (fruit.equals(fruitKey)) {
                    count++;
                }
            }
            result.put(fruitKey, count);
        }
        return result;
    }

    private static HashSet<String> textToArray(String text) {
        String[] textToArray = text.split(" ");
        for (int i = 0; i < textToArray.length; i++) {
            textToArray[i] = textToArray[i].strip();
        }
        System.out.println(Arrays.toString(textToArray));

        return new HashSet<>(List.of(textToArray));
    }

}
