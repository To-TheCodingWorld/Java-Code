public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Exception Handling.....");
        System.out.println("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        try{
            int Result = num1/num2;
            System.out.println("The result is : "+Result);
        }
        catch (ArithmeticException exception){
            System.out.println("Divided by zero Occured");
        }
    }
}
