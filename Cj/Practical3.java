package practical.pkg3;
import java.util.Scanner;
public class Practical3 {

    public static void main(String[] args) {
        System.out.println("Enter the number of names you want to sort");
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[scanner.nextInt()];
        System.out.println("Enter the names");
        for(int i = 0; i < names.length; i++){
            names[i] = scanner.nextLine();
        }
        System.out.println("Sorted List");
        for(int i = 0; i < names.length; i++){
            for (int j = i; j < names.length; j++){
                if(names[i].compareTo(names[j]) > 0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            System.out.println(names[i]);
        }
    }
}
