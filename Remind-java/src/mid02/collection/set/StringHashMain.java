package mid02.collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA+" = "+ (int) charA);
        System.out.println(charB+" = "+ (int) charB);

        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));


        //hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;

    }
}
