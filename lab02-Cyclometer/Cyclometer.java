//////////////////////////////////////////////////////////////////
//Krishen Shah
//January 30, 2015
//CSE2
//lab2-Cyclometer

//Cyclometer that records two kinds of data:
        //time elapsed in seconds
        //number of rotations of the front wheel during that time
//For two trips, given time and rotation count, program should
    //print number of minutes for each trip
    //print the number of counts for each trip
    //print the distance of each trip in miles
    //print the distance for the two trips combinded

public class Cyclometer {
    public static void main(String [] args){
        int secsTrip1=480; //
        int secsTrip2=3220; //
        int countsTrip1=1561; //
        int countsTrip2=9037; //
        double wheelDiameter=27.0,
        PI=3.14159, //
            feetPerMile=5280,
            inchesPerFoot=12,
            secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2, totalDistance;
    
    System.out.println("Trip 1 took "+
    (secsTrip1/secondsPerMinute)+ "minutes and had "+ 
    countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
    (secsTrip2/secondsPerMinute) +" minutes and had "+
    countsTrip2+" counts.");
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    distanceTrip1/=inchesPerFoot*feetPerMile;
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }
}
