public class ForEachLoop {
    public static void main(String[] args) {
        String[] array= new String[]{
                "Ram","Shyam","Rabi","Shubo","Sata","Debu"
        };
        System.out.println("This is for For Loop : ");
        printArray(array);
        System.out.println("This is for ForEach : ");
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
       for (String name :array){
           System.out.print( " " + name);
       }
    }

    public static void printArray(String[] array){
        for (int i=0;i< array.length;i++){
            System.out.println(" "+array[i]);
        }
    }
}
