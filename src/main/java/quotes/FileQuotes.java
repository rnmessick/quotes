package quotes;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileQuotes extends Quote{
    public static Quote[] getQuotesFromFile(Reader quoteData) {
        Gson gson = new Gson();
        try {
            Quote[] quotes = gson.fromJson(
                    new FileReader("src/main/resources/recentQuotes.json"),
                    Quote[].class);
            Quote randomQuote = getRandomQuote(quotes);
            System.out.println(randomQuote);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Quote[] quotes = gson.fromJson(
                quoteData,
                Quote[].class);
        return quotes;
    }

    public static Quote getRandomQuote(Quote[] quotes) {
        return quotes[(int) (Math.random() * quotes.length)];
    }
}
