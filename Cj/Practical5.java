package practical.pkg5;

public class Practical5 {
        public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.areasq(5);
        rectangle.arearect(10);
    }
}
class Square{ 
    int length;
    void areasq(int ln){
        length=ln;
        System.out.println("area of square = "+ ln*ln);
    }
}
class Rectangle extends Square{
    int breadth;
    void arearect(int br){
        breadth= br;
        System.out.println("area of rectangle = "+length*breadth);
    }
}
