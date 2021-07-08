import java.io.IOException;
import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) {
        Path path = Path.of("/home/m/Codes/learning_java/27.file_io_reading_config_file/src/configMap.txt");
        ConfigMapHw map = new ConfigMapHw();
        System.out.println(map.getValueFromConfigMap(path, "database.sdfvgzsdf"));
    }
}
