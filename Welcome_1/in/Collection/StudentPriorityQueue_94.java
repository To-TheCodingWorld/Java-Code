package in.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue_94 {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()- o2.getGrade();
            }
        });
        queue.offer(new Student("Bimal",'B'));
        queue.offer(new Student("Biman",'A'));
        queue.offer(new Student("Rabi",'D'));
        queue.offer(new Student("Ram",'C'));

        System.out.printf("Queue is : %s\n",queue);

        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());

    }

    private  static  class Student{
        private String Name;
        private char Grade;

        public Student(String name, char grade) {
            this.Name = name;
            this.Grade = grade;
        }

        public String getName() {
            return Name;
        }

        public char getGrade() {
            return Grade;
        }

        @Override
        public String toString() {
          return  Name + ": "+Grade ;
        }
    }



}
