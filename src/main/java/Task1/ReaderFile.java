package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class ReaderFile {
    private static final Path PATH = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task1\\resources\\file.txt");
    private static final String D_3_D_3_D_4 = "[\\d]{3}-[\\d]{3}-[\\d]{4}";
    private static final String D_3_1_D_3_D_4 = "[(]{1}[\\d]{3}[)]{1} [\\d]{3}-[\\d]{4}";


    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Ниже представлен список ваших валидных номеров:");

            Files.readAllLines(PATH)
                    .stream()
                    .filter(ReaderFile::isValidNumber)
                    .forEach(System.out::println);

        } catch (NoSuchFileException e) {
            System.out.println("Файла по такому пути не существуюет!");
        }
    }
    public static boolean isValidNumber(String line){
        return line.matches(D_3_D_3_D_4)
                || line.matches(D_3_1_D_3_D_4);

    }
}