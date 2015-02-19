/////////////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw04-Banking Java Program
//
import java.util.Random;
import java.util.Scanner;

public class Banking {
    public static void main(String [] args){
        String input = "";
        Scanner myScanner= new Scanner (System.in);
        Random r= new Random ();
        int Low= 1000;
        int High= 5000;
        int R= r.nextInt (High-Low) + Low;
        
        System.out.println ("Would you like to 'deposit', 'withdraw', or 'view balance'?");
            input=myScanner.next();
        if (input.equals("view balance"));
                 System.out.println (" your balance is "+ R +" ");
        if (input.equals("deposit"));
                System.out.println ("How much do you want to deposit?");
                    int depositNum= myScanner.nextInt();
                    int total= R + depositNum; 
                    System.out.println(" Your new balance is "+total+" ");
        if (input.equals("withdraw"));
                System.out.println ("How much do you want to withdraw?");
                    int withdrawNum= myScanner.nextInt();
                    int total2= R - withdrawNum; 
                    System.out.println(" Your new balance is "+total2+" ");            
                    
    }
}