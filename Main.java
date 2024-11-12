public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(123 ,"Laptop",5600);


        p1.addReview(7.8f,"Quality of display is good" ,"Display" );
        p1.addReview(2.6f , "sound is very bad" , "Sound");

        p1.displayReviews();

    }
}
