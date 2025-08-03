package in.kgcoding.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(55);
        // Another way to declare of wrapper object
        Integer Second = 55;
        System.out.println(first.equals(Second));
        System.out.println(Second);
        int Third = Second;
        System.out.println(Third);
    }
}
