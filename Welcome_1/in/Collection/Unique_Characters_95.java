package in.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Characters_95 {
    public static void main(String[] args) {
        Set<String> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print ("Please enter the string : ");
        String Name = sc.nextLine();

        for(char str : Name.toCharArray()){
            unique.add(String.valueOf(str));
        }

        System.out.println(unique);
        System.out.printf("String has %d unique characters . ",unique.size());

    }
}
