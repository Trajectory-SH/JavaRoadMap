package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("동일성 -> " + (userV1 == userV2));
        System.out.println("동등성 -> " + userV2.equals(userV1));

        UserV2 use1 = new UserV2("1");
        UserV2 use2 = new UserV2("1");

        System.out.println(use2.equals(use1));

    }
}
