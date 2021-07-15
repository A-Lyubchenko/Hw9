package Task2;

import Task2.action.Recording;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFile implements Recording {
    private static final Path PATH_READER = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task2\\resources\\file.txt");
    private static final Path PATH_WRITER = Path.of("D:\\MyProject\\Hw-9\\src\\main\\java\\Task2\\resources\\file.gson");
    private static final List<User> USER_LIST = new ArrayList<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @SneakyThrows
    public void writerGson(){
        String collect = String.join("\n", Files.readAllLines(PATH_READER));
        Scanner scanner = new Scanner(collect);
        while (scanner.hasNextLine()) {
            String name = scanner.next();
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                USER_LIST.add(new User(name, age));
            }
        }
        String toJson = GSON.toJson(USER_LIST);
        Files.writeString(PATH_WRITER, toJson);

    }
}


