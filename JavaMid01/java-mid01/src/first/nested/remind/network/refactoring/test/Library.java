package first.nested.remind.network.refactoring.test;

public class Library {
    public int counter;//0으로 자동 초기화?
    public String[] book;
    public String[] author;

    //생성자
    public Library(int i) {
        book = new String[i];
        author = new String[i];
        counter = 0;
    }

    public void addBook(String book, String author) {
        if (counter < this.book.length) {
            this.book[counter] = book;
            this.author[counter] = author;
            counter++;
            System.out.println("도서 저장 완료: 현재 저장된 책의 수: " + counter);
            System.out.println(book + " 저장....  " + author + " 저장 완료.... ");
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 제목 출력 ==");
        for(int i = 0;i<counter;i++){

        System.out.println("도서 제목: " + book[i] + " 저자: " + author[i]);
         }
    }


}
