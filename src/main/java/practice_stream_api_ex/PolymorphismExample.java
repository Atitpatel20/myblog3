package practice_stream_api_ex;

public class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime polymorphism
        Animal animal = new Animal();
        animal.sound(); // Calls the overridden method in Dog class

        // Compile-time polymorphism
        Dog myDog = new Dog();
        myDog.sound();          // Calls the overridden method in Dog class
        myDog.sound("Loud");    // Calls the overloaded method in Dog class
    }
}
