package in.kgcoding.utils;

import in.kgcoding.geometry.Rectangle;
import in.kgcoding.geometry.circle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculation...\n");
        circle cir = new circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double CirArea=Math.PI * Math.pow(cir.radius, 2);
        System.out.println("The Area of the circle is : " + CirArea);

        double RectArea = rect.breadth* rect.length;
        System.out.println("The area of the Rectangle is : "+RectArea);
    }
}
