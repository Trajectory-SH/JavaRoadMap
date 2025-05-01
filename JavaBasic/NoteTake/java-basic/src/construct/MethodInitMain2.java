package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "학생1", 13, 2);

        MemberInit member2 = new MemberInit();
        initMember(member2, "학생2", 1312, 224);
        MemberInit[] members = new MemberInit[]{member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);

        }
    }
        //값을 복사해서 전달한다...!
    static void initMember(MemberInit a, String b, int c, int d) {
        a.name = b;
        a.age = c;
        a.grade = d;

    }
}
