package example;

// คลาสแม่ (Base class)
class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// คลาสลูก (Derived class) ที่สืบทอดจากคลาสแม่
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

// คลาสลูกอีกตัวอย่าง
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow! Meow!");
    }
}

// การใช้งาน
public class inheritance_test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();   // เรียกใช้เมธอดจากคลาสแม่
        myDog.sleep(); // เรียกใช้เมธอดจากคลาสแม่
        myDog.bark();  // เรียกใช้เมธอดจากคลาสลูก

        Cat myCat = new Cat("Whiskers");
        myCat.eat();   // เรียกใช้เมธอดจากคลาสแม่
        myCat.sleep(); // เรียกใช้เมธอดจากคลาสแม่
        myCat.meow();  // เรียกใช้เมธอดจากคลาสลูก
    }
}
