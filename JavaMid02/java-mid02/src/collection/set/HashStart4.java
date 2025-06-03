package collection.set;

public class HashStart4 {
    //해시 인덱스를 배열의 인덱스로 사용해서 데이터를 조회
    //한계 -> 해시충돌이 발생할 수 있다.
    /*
    * 1 % 10 = 1
    * 11 % 10 = 1
    *
    * */
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
    }

    private static void add(Integer[] inputArray, int value) {
        //값을 추가할 때 항상 해시 인덱스를 먼저 구해야한다.
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

}
