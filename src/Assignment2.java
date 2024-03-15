import java.util.*;
import java.util.Scanner;
public class Assignment2 {
    public static int divide(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Cannot divide by 0");
        }
        return a/b;
    }


    public static void main(String[] args){
        try{
            System.out.println("Enter two integers");
            Scanner myObj = new Scanner(System.in);
            int a = myObj.nextInt();
            int b = myObj.nextInt();
            System.out.println("The output of the following division is " + divide(a,b));
        }
        catch(Exception e){
            System.out.println("Exception occurred while dividing "+e.getMessage());
        }
    }
}
