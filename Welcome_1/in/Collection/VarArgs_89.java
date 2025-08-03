package in.Collection;

public class VarArgs_89 {
    public static void main(String[] args) {
        System.out.println(concatenate("Bimal"));
        System.out.println(concatenate("Bidhan"));
        System.out.println(concatenate("Manoj"));
        System.out.println(concatenate("Gokul"));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str).append("");
        }
        return sb.toString();
    }
}
