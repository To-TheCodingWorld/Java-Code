package in.kgcoding.varargs;

import javax.lang.model.element.Name;

public class varargs {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(Sum(4,5));
        System.out.println(Sum(new int[] {10}));
        System.out.println(Sum1(6,5,6,6,9,5));
        System.out.println(Sum1(" Mahabir ","Shubhankar ","Ramanath "));
    }
    public static String Sum1(String... a) {
        String Name=null;
        for (String i : a) {
            Name =Name + i;
        }
        return Name;
    }

    public static int Sum1(int... a){
        int Sum=0;
        for(int i:a){
            Sum = Sum+i;
        }
        return Sum;
    }
    public static int Sum(int[] a){
        int Sum=0;
        for(int i:a){
            Sum = Sum+i;
        }
        return Sum;
    }
    public static int Sum(int a , int b){
        return a+b;
    }
}