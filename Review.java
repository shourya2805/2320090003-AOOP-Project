package local;

public class Review {
    private int businessId;
    private String user;
    private String review;
    private int rating;

    public Review(int businessId, String user, String review, int rating) {
        this.businessId = businessId;
        this.user = user;
        this.review = review;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "businessId=" + businessId +
                ", user='" + user + '\'' +
                ", review='" + review + '\'' +
                ", rating=" + rating +
                '}';
    }
}
