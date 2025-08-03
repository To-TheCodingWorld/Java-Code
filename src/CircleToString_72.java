import java.util.Scanner;

public class CircleToString_72 {
     double radius;

     public CircleToString_72(double radius){
         this.radius=radius;
     }

     double getCircum(){
         return  2*Math.PI*radius;
     }

     double getArea(){
         return Math.PI*Math.pow(radius,2);
     }

//     public  String toString(){
//         return  "Circle Props : \nRadius in mm : "+radius+", \nArea in mm : "+getArea()+"" +
//                 "\nCircumference in mm : "+getCircum()+"";
//     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the circle calculator ....\n");
        System.out.println("Enter your radius : ");
        int isRadius = sc.nextInt();

        CircleToString_72 Circle = new CircleToString_72(isRadius);
        System.out.println(Circle);
    }
    public  String toString(){
        return  "Circle Props : \nRadius in mm : "+radius+", \nArea in mm : "+getArea()+"" +
                "\nCircumference in mm : "+getCircum()+"";
    }
}
