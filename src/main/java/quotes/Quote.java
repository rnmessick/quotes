package quotes;

public class Quote {

    public String author;
    public String text;

    // constructor

    public Quote(String author, String text) {

        this.author = author;
        this.text = text;
    }

    public String toString() {
        return "Author: " + author + "\nQuote: " + text;
    }
}
