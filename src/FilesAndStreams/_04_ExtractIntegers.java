package FilesAndStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String inputFilePath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt";
        String outputFilePath = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\output.txt";



        FileInputStream in = new FileInputStream(inputFilePath);
        FileOutputStream out = new FileOutputStream(outputFilePath);


        Scanner scanner = new Scanner(in);


        while (scanner.hasNext())  {

            if (scanner.hasNextInt()) {

                int cur = scanner.nextInt();

                String curString =  String.valueOf(cur);

                for (int i = 0; i < curString.length() ; i++) {

                    out.write(curString.charAt(i));

                }
                out.write("\r\n".getBytes());


            }


            scanner.next();

        }





    }
}
