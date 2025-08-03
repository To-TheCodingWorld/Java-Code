package in.Enum;

public class WeekTesting {
    public static void main(String[] args) {
        Day First = Day.Mon;
        Day Second = Day.Tues;
        Day Third = Day.Wed;
        Day Fourth = Day.Thurs;
        Day Fifth = Day.Fri;
        Day Sixth = Day.Satur;
        Day Last = Day.Sun;

//        System.out.println(Day.Mon);

        System.out.println("Print all the days");

        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}

