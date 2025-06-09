package streams_files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class DemoFilesAndPaths {
    public static void main(String[] args) throws IOException {
        Path pathRead = Paths.get("/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/input.txt");
        Path pathWrite = Paths.get("/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/output_task_5.txt");

        List<String> lines = Files.readAllLines(pathRead);
        Files.write(pathWrite, lines);
        Files.write(pathWrite, Collections.singleton("Desi"));
    }
}
