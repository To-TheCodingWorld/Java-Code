public class StringFormat {
    public static void main(String[] args) {
        String name = "Mahabir";
        int marks = 45;
        System.out.println("Hello,"+name+",Your marks are : "+marks);


       System.out.printf("Hello %15S ,your mark is : %0,5d",name,marks);
    }
}
