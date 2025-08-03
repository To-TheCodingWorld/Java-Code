public class Dice {

    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);

    }

    public static void main(String[] args) {
        Dice sc = new Dice();
        for (int i=0;i<25;i++){
            System.out.println(" The random number is : " +sc.roll());
        }
//        System.out.println(" The random number is : " +sc.roll());
    }
}
