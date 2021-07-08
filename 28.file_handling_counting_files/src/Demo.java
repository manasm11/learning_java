import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) {
        Path path = Path.of("/home/m/Codes/learning_java/28.file_handling_counting_files/src");
        String extension = ".java";
        System.out.println(new SearchFilesByExtension().getNumberOfFilesWithExtension(path, extension));
    }
}
