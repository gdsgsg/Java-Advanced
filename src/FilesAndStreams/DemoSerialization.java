package streams_files_directories;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("blue", 2, 5, 6);
        //object cube
        //color: "blue"
        //width: 2
        //height: 5
        //width: 6

        String pathFileForSerialization = "/Users/desislavatopuzakova/Java-Advanced-May-2025/src/streams_files_directories/cubeInfo.ser";

        //сериализация / serialization -> записваме обект във файл (.ser)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathFileForSerialization));
        oos.writeObject(cube);

        //десериализация / deserialization -> прочитаме обект от файл (.ser)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathFileForSerialization));
        Cube newCube = (Cube) ois.readObject();
    }
}
