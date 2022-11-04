import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Start {

    public static void main(String[] args) {

        String fileName = "src\\text.txt";

        try (Stream<String> streams = Files.lines(Paths.get(fileName))) {
            streams.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
