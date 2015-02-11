//////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw03-Bicycle Java Program

//import scanner class
import java.util.Scanner; 
//
public class Bicycle{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        double wheelDiameter=27.0;
        double PI=3.14159,
            feetPerMile=5280,
            inchesPerFoot=12,
            secondsPerMinute=60;
        
        
        //Enter number of counts on a cyclometer
        System.out.print("Enter the number of counts ");
        int nCounts = myScanner.nextInt();
        
        //Enter number of seconds during which the counts occurred
        System.out.print("Enter the number of seconds ");
        int nSeconds = myScanner.nextInt();
        
        //Prints the distance traveled and time
       int nMinutes= nSeconds/60;
       double distanceTrip= nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        System.out.format("The distance was %.2f miles and took " + nMinutes + " mintues long.", distanceTrip);
        
        //Prints average miles per hour
        int nHours=nMinutes/60;
        double avgMPH= distanceTrip/nHours;
         System.out.println("The average mph was "+avgMPH+" ");
        
    }
}