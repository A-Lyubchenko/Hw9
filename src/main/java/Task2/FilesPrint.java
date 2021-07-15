package Task2;

import Task2.action.Recording;
import Task2.action.WriterAndReader;

public class FilesPrint implements WriterAndReader {
    @Override
    public void printIntoFiles(Recording files) {
        files.writerGson();
    }
}
