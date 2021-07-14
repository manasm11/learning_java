import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Demo {
    static final String BASE_URL = "http://localhost:8000/";
    static HttpRequest jokeRequest = getRequest("joke");
    static HttpClient client = HttpClient.newHttpClient();
    HttpResponse<String> response;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String msg = "";
        boolean continue_ = true;
        do {
            String choice = getChoice();
            msg = "Thank you!";
            switch (choice) {
                case "1" -> msg = getJoke();
//                case "2" -> msg = getQuote();
//                case "3" -> msg = getFact();
                default -> continue_ = false;
            }
            System.out.printf(msg+"%n");
        }
        while (continue_);

    }

    private static String getJoke() {
        try {
            return client.send(jokeRequest, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    static String getChoice() {
        System.out.print("""
                Enter:
                    1 Joke
                    2 Quote
                    3 Fact
                    Anything else to Quit:""" + " ");
        return sc.next();
    }

    static HttpRequest getRequest(String endpoint) {
        return HttpRequest.newBuilder(URI.create(BASE_URL + endpoint))
//        return HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .GET().build();
    }
}
