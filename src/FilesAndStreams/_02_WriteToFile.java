package FilesAndStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class _02_WriteToFile {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt";
        String outputPath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\output.txt";

        //: ','  '.' '!' '?'
        List<Character> symbolsToRemove = Arrays.asList(',', '.', '!', '?');

        try (FileInputStream stream = new FileInputStream(inputPath)) {
            try (FileOutputStream outputStream = new FileOutputStream(outputPath)) {


                int oneByte = stream.read();
                while (oneByte > 0) {


                    char current = (char) oneByte;

                    if (!symbolsToRemove.contains(current)) {

                        outputStream.write(oneByte);
                    }
                    oneByte = stream.read();
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}



