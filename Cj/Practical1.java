package practical.pkg1;

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values of a, b and c in quadratic equation");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        if(discriminant<0){
            System.out.println("Roots are imaginary");
        }
        else if(discriminant == 0){
            double root = -b/(2*a); 
            System.out.println("Roots are real and equal. Root = " + root);
        }
        else{
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are " + root1 + " and " + root2);
        }
    }
    
}
