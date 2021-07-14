import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(URI.create(
                        "https://jsonplaceholder.typicode.com/todos/1"
                )).GET().build();
        String responseString = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        JSONObject object = new JSONObject(responseString);
        System.out.println(object);
        System.out.println(object.get("title"));
    }
}
