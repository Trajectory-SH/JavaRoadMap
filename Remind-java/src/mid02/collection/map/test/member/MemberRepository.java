package mid02.collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.getOrDefault(id, null);

    }

    public Member findByName(String name) {
        Collection<Member> members = memberMap.values();
        //key가 아닌 value로 찾기 위해서는 Iterator로 도는 수 밖에 없다.
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    //key로 탐색을 할 때는 각 객체의 equals()와 hashCode()가 특정 필드에 따라서
    //오버라이딩이 되어있다는 가정 하에...객체의 hashcode()를 기반으로 hashIndex를 생성함
    //hashIndex = Math.abs(obj.hashcode()) % CAPACITY
    //각 배열에 들어가서 equals 탐색을 진행한다.(평균적으로 O(1)의 성능을 가짐)

    //keySet도 사실 hashSet이랑 같기 때문에 key값으로 무언가를 탐색하는 속도는 매우 빠르다.
    //다만 values는 방법이 없기 때문에 Collection 타입으로 뽑아내고 iterator를 동작시켜서 찾아야함.

}
