///////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw05

import java.util.Scanner;

public class ToHex {
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        
        String hex="ch0+ch1+ch2+ch3+ch4+ch5";
        
        System.out.println("Please enter three numbers representing RGB values");
        
        int r = myScanner.nextInt();
        int g = myScanner.nextInt();
        int b = myScanner.nextInt();
        
        int hexR = (r/16); 
        int hexR2 = r%16;
        int hexG = (g/16);
        int hexG2 = g%16;
        int hexB = (b/16); 
        int hexB2 = b%16;
        
        char ch0 = hex.charAt(0);
        char ch1 = hex.charAt(1);
        char ch2 = hex.charAt(2);
        char ch3 = hex.charAt(3);
        char ch4 = hex.charAt(4);
        char ch5 = hex.charAt(5);
        
       
    if (r>255 || r < 0 || g > 255 || g <0 || b>255 || b < 0){
        System.out.println("Sorry you must enter values between 0-255");
        return;
    }
        
    switch ( r ){
            
            case 0:
                ch0 ='0';
                ch1 = '0';  
                break;
            case 1:
                ch0 ='0';
                ch1 = '1';  
                break;
            case 2:
                ch0 ='0';
                ch1 = '2';  
                break;
            case 3:
                ch0 ='0';
                ch1 = '3';  
                break;
            case 4:
                ch0 ='0';
                ch1 = '4';  
                break;
            case 5:
                ch0 ='0';
                ch1 = '5';  
                break;
            case 6:
                ch0 ='0';
                ch1 = '6';  
                break;
            case 7:
                ch0 ='0';
                ch1 = '7';  
                break;
            case 8:
                ch0 ='0';
                ch1 = '8';  
                break;
            case 9:
                ch0 ='0';
                ch1 = '9';  
                break;
             case 10:
                ch0 ='0';
                ch1 = 'A';  
                break;
            case 11:
                ch0 ='0';
                ch1 = 'B';  
                break;
            case 12:
                ch0 ='0';
                ch1 = 'C';  
                break;
            case 13:
                ch0 ='0';
                ch1 = 'D';  
                break;
            case 14:
                ch0 ='0';
                ch1 = 'E';  
                break;
             case 15:
                ch0 ='0';
                ch1 = 'F';  
                break;
        }
        
    switch ( hexR ){
            
            case 1:
                ch0 ='1';
                break;
            case 2:
                ch0 ='2';
                break;
            case 3:
                ch0 ='3';
                break;
            case 4:
                ch0 ='4';
                break;
            case 5:
                ch0 ='5';
                break;
            case 6:
                ch0 ='6';
                break;
            case 7:
                ch0 ='7';
                break;
            case 8:
                ch0 ='8';
                break;
            case 9:
                ch0 ='9';
                break;
             case 10:
                ch0 ='A';
                break;
            case 11:
                ch0 ='B';
                break;
            case 12:
                ch0 ='C';
                break;
            case 13:
                ch0 ='D';
                break;
            case 14:
                ch0 ='E';
                break;
             case 15:
                ch0 ='F';
                break;
        }
        
    switch ( hexR2 ){
            case 0:
                ch1='0';
            case 1:
                ch1 ='1';
                break;
            case 2:
                ch1 ='2';
                break;
            case 3:
                ch1 ='3';
                break;
            case 4:
                ch1 ='4';
                break;
            case 5:
                ch1 ='5';
                break;
            case 6:
                ch1 ='6';
                break;
            case 7:
                ch1 ='7';
                break;
            case 8:
                ch1 ='8';
                break;
            case 9:
                ch1 ='9';
                break;
             case 10:
                ch1 ='A';
                break;
            case 11:
                ch1 ='B';
                break;
            case 12:
                ch1 ='C';
                break;
            case 13:
                ch1 ='D';
                break;
            case 14:
                ch1 ='E';
                break;
             case 15:
                ch1 ='F';
                break;
        }
        
    switch ( g ){
            
            case 0:
                ch2 ='0';
                ch3 = '0';  
                break;
            case 1:
                ch2 ='0';
                ch3 = '1';  
                break;
            case 2:
                ch2 ='0';
                ch3 = '2';  
                break;
            case 3:
                ch2 ='0';
                ch3 = '3';  
                break;
            case 4:
                ch2 ='0';
                ch3 = '4';  
                break;
            case 5:
                ch2 ='0';
                ch3 = '5';  
                break;
            case 6:
                ch2 ='0';
                ch3 = '6';  
                break;
            case 7:
                ch2 ='0';
                ch3 = '7';  
                break;
            case 8:
                ch2 ='0';
                ch3 = '8';  
                break;
            case 9:
                ch2 ='0';
                ch3 = '9';  
                break;
             case 10:
                ch2 ='0';
                ch3 = 'A';  
                break;
            case 11:
                ch2 ='0';
                ch3 = 'B';  
                break;
            case 12:
                ch2 ='0';
                ch3 = 'C';  
                break;
            case 13:
                ch2 ='0';
                ch3 = 'D';  
                break;
            case 14:
                ch2 ='0';
                ch3 = 'E';  
                break;
             case 15:
                ch2 ='0';
                ch3 = 'F';  
                break;
        }
        
    switch ( hexG ){
            
            case 1:
                ch2 ='1';
                break;
            case 2:
                ch2 ='2';
                break;
            case 3:
                ch2 ='3';
                break;
            case 4:
                ch2 ='4';
                break;
            case 5:
                ch2 ='5';
                break;
            case 6:
                ch2 ='6';
                break;
            case 7:
                ch2 ='7';
                break;
            case 8:
                ch2 ='8';
                break;
            case 9:
                ch2 ='9';
                break;
             case 10:
                ch2 ='A';
                break;
            case 11:
                ch2 ='B';
                break;
            case 12:
                ch2 ='C';
                break;
            case 13:
                ch2 ='D';
                break;
            case 14:
                ch2 ='E';
                break;
             case 15:
                ch2 ='F';
                break;
        }
        
    switch ( hexG2 ){
            case 0:
                ch3='0';
            case 1:
                ch3 ='1';
                break;
            case 2:
                ch3 ='2';
                break;
            case 3:
                ch3 ='3';
                break;
            case 4:
                ch3 ='4';
                break;
            case 5:
                ch3 ='5';
                break;
            case 6:
                ch3 ='6';
                break;
            case 7:
                ch3 ='7';
                break;
            case 8:
                ch3 ='8';
                break;
            case 9:
                ch3 ='9';
                break;
             case 10:
                ch3 ='A';
                break;
            case 11:
                ch3 ='B';
                break;
            case 12:
                ch3 ='C';
                break;
            case 13:
                ch3 ='D';
                break;
            case 14:
                ch3 ='E';
                break;
             case 15:
                ch3 ='F';
                break;
        }

    switch ( b ){
            
            case 0:
                ch4 ='0';
                ch5 = '0';  
                break;
            case 1:
                ch4 ='0';
                ch5 = '1';  
                break;
            case 2:
                ch4 ='0';
                ch5 = '2';  
                break;
            case 3:
                ch4 ='0';
                ch5 = '3';  
                break;
            case 4:
                ch4 ='0';
                ch5 = '4';  
                break;
            case 5:
                ch4 ='0';
                ch5 = '5';  
                break;
            case 6:
                ch4 ='0';
                ch5 = '6';  
                break;
            case 7:
                ch4 ='0';
                ch5 = '7';  
                break;
            case 8:
                ch4 ='0';
                ch5 = '8';  
                break;
            case 9:
                ch4 ='0';
                ch5 = '9';  
                break;
             case 10:
                ch4 ='0';
                ch5 = 'A';  
                break;
            case 11:
                ch4 ='0';
                ch5 = 'B';  
                break;
            case 12:
                ch4 ='0';
                ch5 = 'C';  
                break;
            case 13:
                ch4 ='0';
                ch5 = 'D';  
                break;
            case 14:
                ch4 ='0';
                ch5 = 'E';  
                break;
             case 15:
                ch4 ='0';
                ch5 = 'F';  
                break;
        }
        
    switch ( hexR ){
            
            case 1:
                ch4 ='1';
                break;
            case 2:
                ch4 ='2';
                break;
            case 3:
                ch4 ='3';
                break;
            case 4:
                ch4 ='4';
                break;
            case 5:
                ch4 ='5';
                break;
            case 6:
                ch4 ='6';
                break;
            case 7:
                ch4 ='7';
                break;
            case 8:
                ch4 ='8';
                break;
            case 9:
                ch4 ='9';
                break;
             case 10:
                ch4 ='A';
                break;
            case 11:
                ch4 ='B';
                break;
            case 12:
                ch4 ='C';
                break;
            case 13:
                ch4 ='D';
                break;
            case 14:
                ch4 ='E';
                break;
             case 15:
                ch4 ='F';
                break;
        }
        
    switch ( hexR2 ){
            case 0:
                ch5='0';
            case 1:
                ch5 ='1';
                break;
            case 2:
                ch5 ='2';
                break;
            case 3:
                ch5 ='3';
                break;
            case 4:
                ch5 ='4';
                break;
            case 5:
                ch5 ='5';
                break;
            case 6:
                ch5 ='6';
                break;
            case 7:
                ch5 ='7';
                break;
            case 8:
                ch5 ='8';
                break;
            case 9:
                ch5 ='9';
                break;
             case 10:
                ch5 ='A';
                break;
            case 11:
                ch5 ='B';
                break;
            case 12:
                ch5 ='C';
                break;
            case 13:
                ch5 ='D';
                break;
            case 14:
                ch5 ='E';
                break;
             case 15:
                ch5 ='F';
                break;
        }

    System.out.println("Your RGB numbers are represented in hexadecimal as: " +ch0 +ch1 +ch2 +ch3 +ch4 +ch5);
    }
}