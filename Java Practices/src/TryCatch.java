import java.sql.SQLOutput;
import java.util.Scanner;

public class TryCatch
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Welcome to the Exception Handling.....");
            System.out.print("Enter the 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the 2nd number : ");
            int num2 = sc.nextInt();

            try{
                int Result = num1/0;
                System.out.println("The result is : "+Result);
            }
            catch (ArithmeticException exception){
                System.out.println("Divided by zero Occured");
            } catch(Throwable th){
                System.out.println("GEneral Exception");
                throw th;
            }
            finally {
                System.out.println("Joy Hanuman ji");
            }
        }
}
