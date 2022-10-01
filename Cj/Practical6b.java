package practical.pkg6b;
public class Practical6b {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        BaseClass derivedClass = new DerivedClass();
        baseClass.display();
        derivedClass.display();
    }    
}

class BaseClass{
    void display(){
        System.out.println("Base Class");
    }
}
class DerivedClass extends BaseClass{
    @Override
    void display(){
        System.out.println("Derived Class");
    }
}