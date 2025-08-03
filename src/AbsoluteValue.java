import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Absloute value checker....\n");
        System.out.println("Please enter the number : ");
        int num = sc.nextInt();

        AbsoluteValue Result = new AbsoluteValue();
        int Ans = Result.isAbsolute(num);
        System.out.println("The Absolute value is : "+Ans);
    }


    public static int isAbsolute(int num){
        return  num>=0?num:-num;
//        if(num>0)
//            return num;
//        else if (num==0)
//            return 0;
//        else
//            return (-num);
    }
}
