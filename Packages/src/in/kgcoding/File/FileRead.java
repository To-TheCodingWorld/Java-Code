package in.kgcoding.File;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String filename = "Jave_Course.txt";

        try(FileReader reader = new FileReader(filename)){
            int read = 0;
            do{
                read=reader.read();
                System.out.print((char)read);
            }while (read!=-1);
        }
        catch (IOException e){
            System.out.printf("Exception occured : %s",e.getMessage());
        }
    }
}
