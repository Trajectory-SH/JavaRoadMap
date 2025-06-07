package mid02.collection.deque.test.stack;

import java.util.ArrayDeque;

public class BrowserHistory {

    private ArrayDeque<String> webPage = new ArrayDeque<>();

    public void visitPage(String page) {
        webPage.push(page);
        System.out.println("방문: " + page);
    }

    public String goBack() {
        webPage.pop();
        System.out.println("뒤로 가기: " + webPage.peek());
        return webPage.peek();
    }

}
