package streams_files_directories;

import java.io.Serializable;

public class Cube implements Serializable {
    //описваме как ще изглежда всяко едно кубче
    private String color;
    private double width;
    private double height;
    private double depth;

    public Cube(String color, double width, double height, double depth) {
        //нов празен обект
        //color = null
        //width = 0
        //height = 0
        //depth = 0
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
