package Polymorphism;

public class Overloading {


    Overloading(){
        System.out.println("Default Constructor called");
    }

    Overloading(String Pop){
        System.out.println(Pop);
    }



    public  int add(int a,int b){
        return a+b;
    }

    public String add(String a, String b){
        return  a+b;
    }

    public  int add(int a,int b,int c,int d){
        return  a+b+c+d;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading("Mahabir");
        int sum =overload.add(5,6);
        System.out.println(overload.add("Mahabir ","Mahato"));
        System.out.println(overload.add(5,sum));


    }
}
