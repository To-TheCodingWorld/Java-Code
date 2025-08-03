public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("First ");
        sb.append(45);
        sb.append(" Now this is the ");
        sb.append(76.45);
        sb.toString();
        System.out.println(sb.toString());
    }
}
