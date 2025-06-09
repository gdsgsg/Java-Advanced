package FilesAndStreams;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _07_ListFiles {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\vasil.vasilev\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");


        if (folder.exists()) {
            if (folder.isDirectory()) {
                File [] files = folder.listFiles();

                for (File file : files) {

                    if (!file.isDirectory()) {

                        System.out.printf("%s: [%d]%n",file.getName(), file.length());


                    }

                }
            }
        }


    }
}
