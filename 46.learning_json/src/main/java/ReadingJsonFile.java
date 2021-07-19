import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class User {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ReadingJsonFile {
    public static void main(String[] args) {
        main1(args);
        main2(args);
    }

    static void main1(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            User user = mapper.readValue(new FileReader("src/main/resources/user.json"), User.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void main2(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try (var reader = new FileReader("src/main/resources/users.json")) {
            User[] users = mapper.readValue(reader, User[].class);
            System.out.println(Arrays.toString(users));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
