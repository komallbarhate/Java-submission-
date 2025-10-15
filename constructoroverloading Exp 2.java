class Student {
String name;
int age;
// Default constructor
Student() {
name = "Unknown";
age = 0;
}
// Constructor with name only
Student(String n) {
name = n;
age = 0;
}
// Constructor with name and age
Student(String n, int a) {
name = n;
age = a;
void display() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
}
public class ConstructorOverloadingDemo {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student("Alice");
Student s3 = new Student("Bob", 20);
s1.display();
s2.display();
s3.display();
}
}