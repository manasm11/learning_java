import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class SearchFilesByExtension {
    public long getNumberOfFilesWithExtension(Path pathToStartSearch, String extension) {
        return Arrays.stream(
                Objects.requireNonNull(pathToStartSearch.toFile()
                        .listFiles(file1 -> file1.getName().endsWith(extension))))
                .count();
    }
}