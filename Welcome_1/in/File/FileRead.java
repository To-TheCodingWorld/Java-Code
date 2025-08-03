package in.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the file name : ");
        String filename = sc.next();

        try (FileReader reader = new FileReader(filename))
        {
            int read;
            while((read = reader.read())!= -1){
                System.out.print((char)read);
            }
        }catch( FileNotFoundException exception){
            System.out.printf("%s not found ",filename);
        }
        catch( IOException exception){
            System.out.printf("Exception Occured : %s ",exception.getMessage());
        }
    }
}
