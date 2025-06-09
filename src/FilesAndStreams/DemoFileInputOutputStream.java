package streams_files_directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileInputOutputStream {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/input.txt";

        //FileInputStream от файла към java app
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(path);
            int oneByte = fileStream.read();
            //read ми дава един байт от файла
            while (oneByte >= 0) {
                //oneByte -> аски кода на прочетения символ
                System.out.print((char) oneByte);
                oneByte = fileStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find the file!");
        } catch (IOException e) {
            System.out.println("Error in reading file!");
        } finally {
            fileStream.close();
        }
    }
}
