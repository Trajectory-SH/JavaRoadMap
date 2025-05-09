package first.nested.remind.network.refactoring.test;

public class LibraryMain {

    public static void main(String[] args) {
        //최대 4권의 도서 저장 도서관 생성
        Library library = new Library(4);

        library.addBook("책1","저자1");
        library.addBook("책2","저자2");
        library.addBook("책3","저자3");
        library.addBook("책4","저자4");
        library.addBook("책5","저자4");

        library.showBooks();
    }
}
