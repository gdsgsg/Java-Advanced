package FilesAndStreams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_CopyBytes {
    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt";
        String outputFilePath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\output.txt";



        try(FileInputStream inputStream = new FileInputStream(inputFilePath)) {
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);


            int inputByte = inputStream.read();
            while (inputByte >= 0) {


                String current = String.valueOf(inputByte);

                if (current.equals("10")) {
                    outputStream.write(inputByte);
                    inputByte = inputStream.read();
                    continue;
                }

                if (current.equals("32")) {
                    outputStream.write(' ');
                    inputByte = inputStream.read();
                    continue;
                }

                    for (int i = 0; i < current.length(); i++) {
                        outputStream.write(current.charAt(i));
                    }


                inputByte = inputStream.read();
            }





        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
