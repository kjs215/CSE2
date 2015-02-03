///////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw02-Arithmetic Calculations

//Compute the cost of the items you buy at Walmart including the PA sales tax of 6%

//Create class called Arithmetic with a main method
public class Arithmetic{
//add main method
public static void main(String[] args){
    //Number of pairs of socks
    int nSocks=3;
    //cost per pair of socks
    double sockCost$=2.58;
    //number of drinking glasses
    int nGlasses=6;
    //cost per glass
    double glassCost$=2.29;
    //number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
        //Cost of Socks
    double totalSC = nSocks*sockCost$;
    double sockTax = totalSC*.06;
    double totalSock = sockTax+totalSC;
        //Cost of glasses
    double totalGC = nGlasses*glassCost$;
    double glassTax = totalGC*.06;
    double totalGlass = glassTax+totalGC;
        //Cost of enevlopes
    double totalEC = nEnvelopes*envelopeCost$;
    double envelopeTax = totalEC*.06;
    double totalEnvelope = envelopeTax+totalEC;
    double noTaxCost = totalEC + totalGC + totalSC;
    double TotalCost = totalEnvelope + totalGlass + totalSock;
    
    
    System.out.printf("Cost of Socks purchased: $%.2f\n", totalSC);
    System.out.printf("Sales Tax for Socks purchased: $%.2f \n\n", sockTax);
    System.out.printf("Cost of Envelopes purchased: $%.2f\n", totalEC);
    System.out.printf("Sales Tax for Envelopes purchased: $%.2f \n\n", envelopeTax);
    System.out.printf("Cost of Glasses purchased: $%.2f\n", totalGC);
    System.out.printf("Sales Tax for Glasses purchased: $%.2f \n\n", glassTax);
    System.out.printf("Total purchase cost before tax: $%.2f \n\n", noTaxCost);
    System.out.printf("Total purchase cost with tax: $%.2f \n\n", TotalCost);
    
}
}