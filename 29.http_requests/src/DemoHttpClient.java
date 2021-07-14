import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DemoHttpClient {
    private static final String ZEN_QUOTE_RANDOM_URL = "https://zenquotes.io/api/random";
    private static final String JSON_PLACEHOLDER_COMMENTS = "https://jsonplaceholder.typicode.com/comments";
    private static final String JSON_PLACEHOLDER_POSTS = "https://jsonplaceholder.typicode.com/posts";

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionControl.NotImplementedException {
        getWithoutParameters();
//        getWithParameters(5);
//        postRequest("Manas", "Heallo", 3);
    }

    public static void getWithoutParameters() {
        String continue_ = "y";
        Scanner sc = new Scanner(System.in);
        while (continue_.equalsIgnoreCase("y")) {
            System.out.println("= " + getRandomZenQuote() + " =");
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

    public static void getWithParameters(int postId) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(JSON_PLACEHOLDER_COMMENTS + "?postId=" + postId))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    public static void postRequest(String title, String body, int userId) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("NI SAMAJH AYA !!!");
//        HttpClient client = HttpClient.newHttpClient();
//        StringBuilder body_ = new StringBuilder();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(JSON_PLACEHOLDER_POSTS))
////                .POST(HttpRequest.BodyPublishers.ofString())
//                .build();
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
