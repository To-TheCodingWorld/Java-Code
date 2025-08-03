import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Day of the week detector....\n");
        System.out.print("Please enter your day in number   : ");
        int num = input.nextInt();
        oldSwitch(num);
        newSwitch(num);
    }

        public static void oldSwitch (int num){
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    public static  void newSwitch (int num)
    {
        String Output = switch (num)
        {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 ,7 -> "Saturday";
            case 8-> "Sunday";
            default -> "Invalid";
        };
            System.out.println(Output + " ...For new cases");
    }
}
