class MathOperations {
// Method to add two integers
int add(int a, int b) {
return a + b;
}
// Overloaded method to add three integers
int add(int a, int b, int c) {
return a + b + c;
}
// Overloaded method to add two doubles
double add(double a, double b) {
return a + b;
}
}
public class MethodOverloadingDemo {
public static void main(String[] args) {
MathOperations math = new MathOperations();
System.out.println("Sum of 2 ints: " + math.add(5, 10));
System.out.println("Sum of 3 ints: " + math.add(5, 10, 15));
System.out.println("Sum of 2 doubles: " + math.add(5.5, 10.2));
}
}