import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ConfigMapHw {

    public String getValueFromConfigMap(Path configMapFilePath, String keyName) {
        try {
            try (var lines = Files.lines(configMapFilePath)) {
                try {
                    return lines.filter(line -> line.contains(keyName))
                            .collect(Collectors.toList()).get(0)
                            .split("=")[1].strip();
                } catch (Exception e) {
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }
}