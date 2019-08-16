package quotes;

public class Quote {

    public String author;
    public String text;

    // constructor

//    public Quote(String author, String text) {
//
//        this.author = author;
//        this.text = text;
//    }

    public String toString() {

        if (author == null && text == null) {
            return "Exception. Empty String";
        } else if (author == null) {
            author = "Ron Swanson";

        } else {
            return "Author: " + author + " Quote: " + text;
        }
        return "Author: " + author + " Quote: " + text;
    }
}
