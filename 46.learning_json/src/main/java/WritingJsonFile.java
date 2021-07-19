import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

class Essay {
    String title;
    String text;

    public Essay(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

public class WritingJsonFile {

    public static void main(String[] args) {
        Essay[] essays = new Essay[]{
                new Essay("Sun", "Sun is bright yellow/white ball"),
                new Essay("Car", "Car helps us to become lazy and travel faster")
        };
        ObjectMapper mapper = new ObjectMapper();
        try (var writer = new FileWriter("src/main/resources/essays.json")) {
            mapper.writeValue(writer, essays);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void main1(String[] args) {
        Essay essay = new Essay("Rain", "Rain is a very good thing");
        ObjectMapper mapper = new ObjectMapper();
        try (var writer = new FileWriter("src/main/resources/essay.json")) {
            mapper.writeValue(writer, essay);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
