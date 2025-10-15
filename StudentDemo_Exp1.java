import java.util.Scanner;

class Student {
    // 1. Fields are private for encapsulation
    private int rollNo;
    private String name;
    private int marks;

    // 2. A constructor to initialize the object
    // This constructor takes the data as parameters.
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Default constructor (optional)
    public Student() {
        // You can initialize with default values if you want
        this.name = "Unknown";
        this.rollNo = 0;
        this.marks = 0;
    }

    // 3. Public "getter" methods to access private fields
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    
    // Method to display student information
    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
}

public class StudentDemo { // Renamed from Exp1 for clarity
    public static void main(String[] args) {
        // 4. Create a single Scanner in main
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter roll number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        // 5. Use the constructor to create and initialize the student object
        Student student1 = new Student(name, rollNo, marks);

        // Display the details
        student1.display();
        
        // Always good practice to close the scanner when done
        sc.close();
    }
}