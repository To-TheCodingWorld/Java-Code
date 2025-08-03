public class WordConcatenate {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("My name is Mahabir Mahato\n");
        word.append("My age is : ");
        word.append(23);
        word.append("\nI live in Purulia.\n");
        word.append("My college name is : ");
        word.append("Dr. B C Roy Engineering college");
        word.append("\n And Roll number is : ");
        word.append(2408010);
        System.out.println(word.toString());
    }
}
