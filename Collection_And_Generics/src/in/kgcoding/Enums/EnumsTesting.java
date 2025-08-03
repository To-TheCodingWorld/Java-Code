package in.kgcoding.Enums;

public class EnumsTesting {
    public static void main(String[] args) {
        TraficLight Color = TraficLight.Red;
        TraficLight Color1 = TraficLight.Green;
        System.out.println(TraficLight.valueOf(String.valueOf(Color)));


        Grade Ram = Grade.A;
        Grade Bikash=Grade.B;
        Grade Shubo = Grade.C;
        Grade Akash = Grade.D;
        System.out.println(Grade.valueOf(String.valueOf(Ram)));
        System.out.println(Grade.valueOf(String.valueOf(Akash)));
        System.out.println("Joy Shree Ram ");
        for(Grade  value : Grade.values()){
            System.out.println(value);
        }
    }

}
