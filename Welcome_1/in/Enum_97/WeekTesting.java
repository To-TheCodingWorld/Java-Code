package in.Enum_97;

public class WeekTesting {
    public static void main(String[] args) {
        for (Day Week : Day.values()){
            System.out.printf("%s : %s\n",Week , Week.getType());
        }
    }
}
