
public class Product {
    private int id;
    private String title;
    private int price;
    private Review[] reviews;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.reviews = new Review[10];
        this.price = price;

    }
    public void displayReviews() {
        System.out.println("Reviews for Product ID: " + id + ", Title: " + title);
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] != null) {
                System.out.println("Review " + (i + 1) + ":");
                System.out.println("Title: " + reviews[i].getTitle());
                System.out.println("Body: " + reviews[i].getBody());
                System.out.println("Rating: " + reviews[i].getRating());
                System.out.println();
            }
        }
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void addReview(float rating, String remark, String title) {
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] == null) {
                reviews[i] = new Review(rating, remark, title);
                return;
            }
        }
        System.out.println("Review Limit is full");
    }

    public class Review {
        private float rating;
        private String remark;
        private String title;

        public Review(float rating, String body, String title) {
            this.rating = rating;
            this.remark = remark;
            this.title = title;
        }
        public float getRating() {
            return rating;
        }
        public void setRating(float rating) {
            this.rating = rating;
        }
        public String getBody() {
            return remark;
        }
        public void setBody(String body) {
            this.remark = body;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }

}
