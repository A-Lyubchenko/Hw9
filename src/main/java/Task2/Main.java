package Task2;

import Task2.action.WriterAndReader;

public class Main {
    public static void main(String[] args) {
        WriterAndReader writerAndReader = new FilesPrint();
        writerAndReader.printIntoFiles(new WriterFile());
        writerAndReader.printIntoFiles(new ReaderFile());
    }
}
