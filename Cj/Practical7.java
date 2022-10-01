package practical.pkg7;
public class Practical7 {
    public static void main(String[] args) {
        try{
            if(true)
                throw new CustomException("Test Exception");
            System.out.println("This will not be printed");
        }
        catch(CustomException c){
            System.out.println(c);
        }
    }
    
}

class CustomException extends Exception{    
    String str;
    CustomException(String s){
       str = s;  
    }
    @Override
    public String toString(){
        return("Exception:" + str); 
     }
}
