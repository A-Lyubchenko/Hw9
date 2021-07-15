package Task3;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Reader {

    private static final Path PATH = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task3\\resources\\file.txt");
    private static final Map<String, Integer> WORD_COUNT = new TreeMap<>();

    @SneakyThrows
    public static void main(String[] args) {
        String join = String.join("\n", Files.readAllLines(PATH))
                .replaceAll("\\s+", " ");

        for (String word : join.split(" ")) {
            WORD_COUNT.put(word, WORD_COUNT.getOrDefault(word, 0) + 1);
        }

        WORD_COUNT.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);

    }
}
