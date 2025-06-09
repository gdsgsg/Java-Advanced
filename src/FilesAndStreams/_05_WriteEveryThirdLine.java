package FilesAndStreams;

import java.io.*;
import java.util.Scanner;

public class _05_WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        //файла, от който ще четем
        String pathRead = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt";
        FileInputStream readStream = new FileInputStream(pathRead);
        Scanner reader = new Scanner(readStream);

        //файла, в който ще пишем
        String pathWrite = "C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\output.txt";
        FileOutputStream writeStream = new FileOutputStream(pathWrite);
        PrintWriter writer = new PrintWriter(writeStream);

        int count = 1; //номер на реда, на който се намирам
        String line = reader.nextLine(); //първия ред от файла

        //hasNextLine -> true: има следващ ред във файла и мога да го прочета
        //hasNextLine -> false: намирам на последния ред във файла и няма друг след него
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }

        writer.close();
        reader.close();
    }
}
