public class WordConcatenate_75 {
    public static void main(String[] args) {
        String [] arr = new String[]
                {"My","name","is","Mahabir","Mahato.","I","am","from","middle","class","family."};
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(word).append(" ");
        }
        System.out.println(sb);
    }
}
