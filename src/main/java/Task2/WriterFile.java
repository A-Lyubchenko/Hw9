package Task2;

import Task2.action.Recording;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterFile implements Recording {
    private static final Path PATH = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task2\\resources\\file.txt");
    private static final String USERS = """
            name age
            alice 21
            ryan 30
            """;

    @SneakyThrows
    @Override
    public void writerGson() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(PATH)))) {
            bufferedWriter.write(USERS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

