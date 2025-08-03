package in.Enum_97;

public enum Day {
    Sunday(true),
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(false),
    Saturday(false);

    private final boolean isWeek;

    Day(boolean isWeek) {
        this.isWeek = isWeek;
    }

    public String getType(){
        return isWeek ? "WeekDay" : "WeekEnd";
    }
}
