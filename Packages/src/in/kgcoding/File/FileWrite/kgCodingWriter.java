package in.kgcoding.File.FileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class kgCodingWriter {
    public static void main(String[] args) {
        String filename = "Java_course.txt";

        try (FileWriter writer = new FileWriter(filename)){
            writer.write("This is the best Java course.\n");
            for(int i=0;i<=1000;i++){
                writer.write("*");
            }
            System.out.println("File written Sucessfully");
        }catch (IOException exception){
            System.out.printf("Exception occured %s\n",exception.getMessage());
        }

    }
}
