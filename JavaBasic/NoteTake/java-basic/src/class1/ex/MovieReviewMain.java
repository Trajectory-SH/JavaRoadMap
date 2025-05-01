package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        //리뷰 정보 선언
        MovieReview reviewInfo = new MovieReview();
        reviewInfo.title = "Her";
        reviewInfo.review = "클레멘타인 같은 영화";

        System.out.println(reviewInfo.title+reviewInfo.review);

    }
}
