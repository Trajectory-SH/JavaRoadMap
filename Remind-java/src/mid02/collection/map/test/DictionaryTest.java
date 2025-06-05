package mid02.collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> myDictionary = new HashMap<>();
    }



    private static void searchWord(Scanner scanner, HashMap<String, String> myDictionary) {
        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchValue = scanner.nextLine();
            if (searchValue.equals("q")) {
                System.out.println("==dictionary 종료==");
                break;
            }
            if (!myDictionary.containsKey(searchValue)) {
                System.out.println(searchValue+"은(는) 사전에 없는 단어입니다.");
                continue;
            }
            System.out.println(searchValue + "의 뜻: " + myDictionary.get(searchValue));
        }
    }

    private static HashMap<String, String> inputWord(Scanner scanner, HashMap<String, String> myDictionary) {
        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = scanner.nextLine();
            //검증 로직
            if (key.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String value = scanner.nextLine();

            myDictionary.put(key, value);
        }
        return myDictionary;
    }
}
