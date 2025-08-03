public class BreakAndContinue {
    public static void main(String[] args) {
//        System.out.println("Before Loop");
//        for (int i = 0; i<1000;i++){
//            if(i==101){
//                break;
//            }
//            System.out.println(" " +i);
//        }
//        System.out.print("Out of the loop");



        System.out.println("Before Loop");
        for (int i = 0; i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(" " +i);
        }
        System.out.print("Out of the loop");
    }
}
