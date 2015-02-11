//////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw03-Root Java Program

//import scanner class
import java.util.Scanner; 
//
public class Root{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.print("Enter a double and I print its cube root: ");
        double number = myScanner.nextInt();
        double guess= number/3;
        double root= ((guess*guess*guess+number)/(3*guess*guess));
        System.out.println("The cube root is "+root+"");
    }
}
        