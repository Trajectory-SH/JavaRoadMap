package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "허니잼";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "익스트림 잼";

        MovieReview[] movieList = {inception, aboutTime};

        for (MovieReview content : movieList) {
            System.out.println("영화 제목: "+content.title+"  영화 리뷰: "+content.review);

        }

    }
}
