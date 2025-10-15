class Animal {
String name;
Animal(String name) {
this.name = name;
}
void speak() {
System.out.println(name + " makes a sound.
");
}
}
// Child class
class Dog extends Animal {
Dog(String name) {
super(name); // call the parent constructor
}
void speak() {
System.out.println(name + " barks.
");
}
}
// Main class
public class InheritanceExample {
public static void main(String[] args) { Animal
a = new Animal("Generic Animal");
a.speak(); // Output: Generic Animal makes a sound.
Dog d = new Dog("Buddy");
d.speak(); // Output: Buddy barks.
}
}