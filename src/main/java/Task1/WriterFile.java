package Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class WriterFile {
    private static final Path PATH = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task1\\resources\\file.txt");
    private static final List<String> NUMBERS_OF_PHONE = Arrays.asList("987-123-4567", "123 456 7890", "(123) 456-7890");

    public static void main(String[] args){
        writerFile();
    }
    public static void writerFile() {
        if (!Files.exists(PATH)) {
            try {
                Files.createFile(PATH);
                Files.write(PATH, NUMBERS_OF_PHONE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Файл успешно записан!");
    }
}
