package remind01.extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Item book = new Book("Java",10000,"han","12345");
        Item album = new Album("앨범 1", 16000, "seo");
        Item movie = new Movie("영화 1",18000,"감독1","배우1");


        Item[] items = {book, album, movie};
        System.out.println(items.length);
        int sum = 0;
        for (Item s : items) {
            s.print();
            sum += s.getPrice();
        }
        System.out.println("상품 가격의 합: " + sum);



    }
}
