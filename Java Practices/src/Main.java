// Method Override Examples.............

class Parent
{
    void display()
    {
        System.out.println("Display method in Parent");
    }
}
class Child extends Parent
{
    @Override
    void display()
    {


        System.out.println("Display method in Child");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Parent obj = new Child(); // Parent reference, Child object
        obj.display(); // Calls Child's overridden method
    }
}


