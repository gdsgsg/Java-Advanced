package streams_files_directories;

import java.io.File;

public class  DemoFile {
    public static void main(String[] args) {
        File file = new File("/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/input.txt");

        boolean isExisting = file.exists();
        long length = file.length();
        boolean isDirectory = file.isDirectory();
        File[] files = file.listFiles();
        boolean canRead = file.canRead();
        boolean canWrite = file.canWrite();
        boolean successfulDelete = file.delete();
        //true -> успешно изтрит файл
        //false -> неуспешно ми е изтрит файла


    }
}
