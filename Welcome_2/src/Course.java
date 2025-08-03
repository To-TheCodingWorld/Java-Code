public class Course {
    static int MaxCapacity =100;
    String CourseName;
    int enrollments;
    String[] enrolledStudents;


    Course(String CourseName){
        this.CourseName=CourseName;
        System.out.println("Course Name : " +CourseName);
        this.enrollments=0;
        this.enrolledStudents = new String[MaxCapacity];
    }


    static void setMaxCapacity(int maxCapacity){
        Course.MaxCapacity=maxCapacity;
    }

    void enrollStudent(String StudentName){
        enrolledStudents[enrollments]=StudentName;
        System.out.println("Student Name : " + StudentName);
        enrollments++;
    }

    void unenrollStudent(String StudentName){
        System.out.println("Student removed");
        System.out.println("Unroll Student Name : " + StudentName);
        enrollments--;
    }

    public static void main(String[] args) {
        Course MCA = new Course("MCA");
        Course BTECH = new Course("BTECH");
        Course MBA = new Course("MBA");
        Course MBBS = new Course("MBBS");
        System.out.println(Course.MaxCapacity);
        BTECH.enrollStudent("Shubhankar");
        BTECH.enrollStudent("Gokul");
        MBBS.unenrollStudent("Debjyoti");
        BTECH.enrollStudent("Shubhankar");
        BTECH.enrollStudent("Shubhankar");
        BTECH.enrollStudent("Shubhankar");

    }
}

