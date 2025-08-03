import java.util.Scanner;

public class MultificationTable {
    public static void main(String[] args) {
        greeting();
        Table();
    }

    public static int Table()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();

        int i = 1;
        while (i<=10){
            int Result = num*i;
            System.out.println(+num+"X"+i+"="+Result);
            i++;
        }
        return 0;
    }

    public static void greeting(){
        System.out.println("Welcome to the Multification Table...\n");
    }
}
