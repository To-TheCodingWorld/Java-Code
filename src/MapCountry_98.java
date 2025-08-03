import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCountry_98 {
    public static void main(String[] args) {

        Map<String,String> Country=new HashMap<>();
        Country.put("India","New Delhi");
        Country.put("USA","Washington DC");
        Country.put("UK","London");
        Country.put("Australia","Canbera");
        Country.put("China","Bejing");

        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the country List....");
        System.out.print("Please enter the country name : ");
        String world = sc.nextLine();


       if(Country.containsKey(world)){
           System.out.printf("Capital of %s is %s . ",world,Country.get(world ));
       }else{
           System.out.println("It does not exit..");
       }
    }
}
