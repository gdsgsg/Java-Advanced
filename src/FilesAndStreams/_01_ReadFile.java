package FilesAndStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt";

        try(FileInputStream stream = new FileInputStream(path)) {

            int oneByte = stream.read();
            while (oneByte >= 0) {

                System.out.printf("%s ",Integer.toBinaryString(oneByte));


                oneByte = stream.read();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
