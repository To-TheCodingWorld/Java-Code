package Polymorphism.pass_by;

public class TestPassByReference {

    public static void main(String[] args) {
        Point first = new Point(4,8);
        System.out.println("First"+first);
        move(first);
        System.out.println(("first"+first));
    }

    public static void move(Point P){
        P.x++;
        P.y++;
        System.out.println(P);
    }
    public  static  class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
