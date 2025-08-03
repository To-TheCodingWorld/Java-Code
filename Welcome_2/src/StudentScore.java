import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student score..\n");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the number : ");
        int num = sc.nextInt();

        String category = num>80?"High" : (num>50?"Moderate" : "Low");
        System.out.println(category);

        System.out.println("");

        IsScore(num);

    }

    public static void IsScore(int num){
        if(num>=80)
            System.out.println("You have got High Score");
        else if (num>=50 && num<80)
            System.out.println("You Have got Moderate Score");
        else
            System.out.println("You have got Low Score");
    }
}
