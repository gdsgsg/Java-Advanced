package FilesAndStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _06_SortLines {
    public static void main(String[] args) throws IOException {


        Path inPath = Paths.get("C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\input.txt");
        Path outPath = Paths.get("C:\\Users\\vasil.vasilev\\IdeaProjects\\reporting\\Java_Advanced\\src\\FilesAndStreams\\output.txt");

        List<String> lineList = Files.readAllLines(inPath);
        Collections.sort(lineList);

        List<String> trimmed = lineList.stream()
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .collect(Collectors.toList());

        Files.write(outPath, trimmed);


    }
}
