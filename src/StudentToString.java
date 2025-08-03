public class StudentToString {
    String name;

    int age;
    String rollNo;
    String house;

    public StudentToString(String name, String rollNo, int age, String house) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.house = house;
    }

    public String toString()
    {
        return "Student Details : \nname:"+name+" , age:"+age+" ,Roll Number:"+rollNo+" , House:"+house+" ";
    }

    public static void main(String[] args) {
        StudentToString std= new StudentToString("Mahabir","2564",23,"Purulia");
        System.out.println(std);
    }
}
