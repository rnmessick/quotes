package quotes;

public class Quote {

//    private String[] tags;
    private String author;
//    private String likes;
    private String text;

    // constructor

    public Quote(String author, String text) {

//        this.tags = tags;
        this.author = author;
//        this.likes = likes;
        this.text = text;
    }

    public String toString() {
        return "Author: " + author + "Quote: " + text;
    }
}
