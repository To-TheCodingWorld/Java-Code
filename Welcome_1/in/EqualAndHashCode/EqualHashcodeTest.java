package in.EqualAndHashCode;

public class EqualHashcodeTest {
    public static void main(String[] args) {
        Person per1 =new Person("Mahabir",23);
        Person per2=new Person("Mahabir",23);

        if (per1.equals(per2))
            System.out.println("Equal");
        else
            System.out.println("Not equals");
    }
}
