package mid02.collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println("stack.getClass() = " + stack.getClass());

        //실제 값을 꺼내지 않고 다음에 나올 값을 조회해보기 peek
        System.out.println("stack.peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

    }
}
