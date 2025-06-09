package streams_files_directories;

import java.io.*;

public class DemoBufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String firstLine = reader.readLine(); //първия ред от файла

        BufferedWriter writer = new BufferedWriter(new FileWriter("demo-buffer.txt"));
        writer.write("I am Desislava.");
        writer.newLine();
        writer.write("I am 27 years old.");

        //след като приключим работа -> затваряме
        reader.close();
        writer.close();

    }
}
