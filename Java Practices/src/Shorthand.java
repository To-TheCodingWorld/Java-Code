import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int x1= sc.nextInt();
        a=a+x1;
        System.out.println(a);
        int x2= sc.nextInt();
        a-=x2;
        System.out.println(a);
        int x3= sc.nextInt();
        a*=x3;
        System.out.println(a);
        int x4= sc.nextInt();
        a/=x4;
        System.out.println(a);

    }
}
