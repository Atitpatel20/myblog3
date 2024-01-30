package practice_stream_api_ex;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding for runtime polymorphism
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Additional method for compile-time polymorphism (method overloading)
    void sound(String barkType) {
        System.out.println("Dog barks: " + barkType);
    }
}

