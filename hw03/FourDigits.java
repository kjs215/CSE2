//////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw03-FourDigits Java Program

//import scanner class
import java.util.Scanner; 
//
public class FourDigits{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.println("enter a double:");
        double number = myScanner.nextDouble();
        double number2 = number*10000;
        double number3 = number2 % 10000;
        System.out.printf("%.0f \n", number3);
    }
}