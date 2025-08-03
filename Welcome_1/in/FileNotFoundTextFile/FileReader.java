//package in.FileNotFoundTextFile;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class FileReader {
//    public static void main(String[] args) {
//        Scanner file = new Scanner(System.in);
//        System.out.println("Please enter the filename you want....\n ");
//        String fileName = file.next();
//
//
//        try(FileReader reader = new FileReader(fileName)){
//            int read =0;
//            while((read = reader.read()) != -1){
//                System.out.print((char)read);
//            }
//        }catch (IOException exception){
//            System.out.printf("Exception occurred : %s",exception.getMessage());
//        }
//    }
//}
