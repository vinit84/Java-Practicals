package practical.pkg4;
import animals.*;

public class Practical4{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal cow = new Cow();
        cat.speak();
        cat.animalName();
        cow.speak();
        cow.animalName();
    }
}
class Cat implements Animal{    
    @Override
    public void speak() {
        System.out.println("Meow");
    }
    @Override
    public void animalName() {
        System.out.println("Cat");
    }
}
class Cow implements Animal{    
    @Override
    public void speak() {
        System.out.println("Moo");
    }
    @Override
    public void animalName() {
        System.out.println("Cow");
    }
}
