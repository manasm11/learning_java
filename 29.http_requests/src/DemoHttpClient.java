import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Scanner;

public class DemoHttpClient {
    private static final String ZEN_QUOTE_RANDOM_URL = "https://zenquotes.io/api/random";

    public static void main(String[] args) {
        String continue_ = "y";
        Scanner sc = new Scanner(System.in);
        while (continue_.equalsIgnoreCase("y")) {
            System.out.println("=== "+getRandomZenQuote()+" ===");
            System.out.print("Continue? (Y,n): ");
            continue_ = sc.next();
        }
    }

    public static String getRandomZenQuote() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(ZEN_QUOTE_RANDOM_URL))
                .build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        assert response != null;
        return response.body().split(":")[1].split("\"")[1];
    }
}
