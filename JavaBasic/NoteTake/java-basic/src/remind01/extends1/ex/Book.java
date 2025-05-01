package remind01.extends1.ex;

public class Book extends Item {
    String author;
    String isbn;

    public Book(String name, int price,String author, String isbn) {
        super(name, price);//Parent의 생성자를 꼭 첫 줄에 호출해줘야함 => 메모리 영역에 인스턴스 생성
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}
