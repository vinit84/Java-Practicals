package practical.pkg6;
public class Practical6 {
    public static void main(String[] args) {
           System.out.println("add(5, 3) = " + add(5, 3));
           System.out.println("add(5, 3, 8) = " + add(5, 3, 8));
    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}
