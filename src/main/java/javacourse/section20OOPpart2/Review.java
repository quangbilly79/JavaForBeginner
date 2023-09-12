package javacourse.section20OOPpart2;

public class Review {
    int id;
    String description;
    int score;

    public Review(int id, String description, int score) {
        this.id = id;
        this.description = description;
        this.score = score;
    }

    public String toString() {
        return String.format("(id: %s, description: %s, score: %s)",
                id, description, score);
    }
}
