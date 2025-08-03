public class ConcatinateAndConvert {
     String first_name ;
     String second_name ;

    public ConcatinateAndConvert(String second_name, String first_name) {
        this.second_name = second_name;
        this.first_name = first_name;

        System.out.printf("Your Full Name  is  : %S %S ",first_name,second_name);
    }

    public static void main(String[] args) {
        ConcatinateAndConvert sc = new ConcatinateAndConvert("Mahato","Mahabir");

    }
}
