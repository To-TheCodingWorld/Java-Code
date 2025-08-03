package in.Overload_85;

public class Calculator {
   public int add(int first , int second){
       return first + second;
   }

    public int add(int first , int second ,int third){
        return first + second+third;
    }

    public  double add( double first , double second){
       return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4,9));
        System.out.println(calc.add(8,9,55));
        System.out.printf("%.2f ",calc.add(5.8,9.8));
    }
}
