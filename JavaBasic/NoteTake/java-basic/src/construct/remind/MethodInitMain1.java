package construct.remind;

//무언가 회원을 모아서 실제로 작업들을 수행할 때...
//회원을 등록하는 행동을 많이 하기 때문에 이걸 메서드로 만들어서 사용해보자.
// 만약에 Main 함수 위에 메서드를 선언했다면 모듈화는 진행했지만...
// 속성과 기능이 분리되어 있기 때문에 아직 절차지향 프로그래밍의 단계에 머물러 있다고 본다.

public class MethodInitMain1 {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade =90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 19;
        member2.grade =80;


        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}
