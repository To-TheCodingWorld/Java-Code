public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Rabi";

        System.out.println("******");

        if(isMale)
            System.out.println("Mr." +name);
        else
            System.out.println("Mrs." +name);
        System.out.println("Thank you.....");

        System.out.println("\n");

        boolean isSeniorCitizen = false;
        boolean isAdult = true;

        if(isSeniorCitizen)
            System.out.println("Hello Senior Citizen..");
        else if (isAdult)
                System.out.println("Hello Young Man...");
            else
                System.out.println("Hello Baby...");

    }
}
