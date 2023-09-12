package javacourse.section20OOPpart2;

import java.util.ArrayList;

public class Book {
    int id;
    String name;
    String author;

    ArrayList<Review> reviewList = new ArrayList<Review>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        reviewList.add(review);
    }

    public String toString() {
        return String.format("id: %s\nname: %s\nauthor %s\nreviewList: %s",
                id, name, author, reviewList.toString());
    }

}
