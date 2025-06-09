package streams_files_directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoScannerPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner (FileReader)
        //PrintWriter (FileWriter)

        String pathRead = "/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/DemoReadScanner.txt";
        String pathWrite = "/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/DemoWritePrintWriter.txt";

        FileInputStream readStream = new FileInputStream(pathRead);
        FileOutputStream writeStream = new FileOutputStream(pathWrite);

        Scanner reader = new Scanner(readStream);
        PrintWriter writer = new PrintWriter(writeStream);

       String firstLine = reader.nextLine();
       writer.println(firstLine);

       reader.close();
       writer.close();

    }
}
