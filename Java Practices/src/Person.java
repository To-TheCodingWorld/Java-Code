// Copy Constructor Examples .............

public class Person {
        private String name;
        private int age;

        // Default constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        public Person(Person another) {
            this.name = another.name;
            this.age = another.age;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {
            // Creating an original object
            Person person1 = new Person("Alice", 25);
            person1.displayDetails();
            // Creating a copy of the original object
            Person person2 = new Person(person1);
            person2.displayDetails();
        }
    }

