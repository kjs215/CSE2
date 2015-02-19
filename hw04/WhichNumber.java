/////////////////////////////////////////////////////////////
//Krishen Shah
//CSE 2
//hw04-Which Number Java Program
//
import java.util.Scanner;

public class WhichNumber {
    public static void main(String[] args) {
        String input = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 10 inclusive");

        System.out.println("Is the number even?");
        input = myScanner.next();
        if (input.equals("Y") || input.equals("y")) {
            System.out.println("Is it divisible by 3?");
            input = myScanner.next();
            if (input.equals("Y") || input.equals("y")) {
                System.out.println("Is your number 6");
                input = myScanner.next();
                if (input.equals("Y") || input.equals("y"))
                    System.out.println("Yay!");
                else if (input.equals("N") || input.equals("n"))
                    System.out.println("Boo");
                else{
                    System.out.println("Error: Invalid input. Terminating Program.");
                System.exit(0);}
            }
            else if (input.equals("N") || input.equals("n")) {
                System.out.println("Is it divisible by 4?");
                input = myScanner.next();
                if (input.equals("Y") || input.equals("y")) {
                    System.out.println("Is the number divided by 4 greater than 1?");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y")) {
                        System.out.println("Is your number 8");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    else if (input.equals("N") || input.equals("n")) {
                        System.out.println("Is your number 4");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    
                }
                else if (input.equals("N") || input.equals("n")) {
                    System.out.println("Is the number divisible by 5?");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y")) {
                        System.out.println("Is your number 10");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    else if (input.equals("N") || input.equals("n")) {
                        System.out.println("Is your number 2");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                }
               else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);} 
            }
            else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
        }
        else if (input.equals("N") || input.equals("n")) {
            System.out.println("Is it divisble by 3?");
            input = myScanner.next();
            if (input.equals("Y") || input.equals("y")) {
                System.out.println("When divided by 3 is the result greater than 1?");
                input = myScanner.next();
                if (input.equals("Y") || input.equals("y")) {
                    System.out.println("Is your number 9");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y"))
                        System.out.println("Yay!");
                    else if (input.equals("N") || input.equals("n"))
                        System.out.println("Boo");
                    else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                    System.exit(0);}
                }
                else if (input.equals("N") || input.equals("n")) {
                    System.out.println("Is your number 3");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y"))
                        System.out.println("Yay!");
                    else if (input.equals("N") || input.equals("n"))
                        System.out.println("Boo");
                    else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                    System.exit(0);}
                }
            }
            else if (input.equals("N") || input.equals("n")) {
                System.out.println("Is it greater than 6?");
                input = myScanner.next();
                if (input.equals("Y") || input.equals("y")) {
                    System.out.println("Is your number 7");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y"))
                        System.out.println("Yay!");
                    else if (input.equals("N") || input.equals("n"))
                        System.out.println("Boo");
                    else{
                        System.out.println("Error: Invalid input. Terminating Program.");
                    System.exit(0);}
                }
                else if (input.equals("N") || input.equals("n")) {
                    System.out.println("Is it less than 3?");
                    input = myScanner.next();
                    if (input.equals("Y") || input.equals("y")) {
                        System.out.println("Is your number 1");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    else if (input.equals("N") || input.equals("n")) {
                        System.out.println("Is your number 5");
                        input = myScanner.next();
                        if (input.equals("Y") || input.equals("y"))
                            System.out.println("Yay!");
                        else if (input.equals("N") || input.equals("n"))
                            System.out.println("Boo");
                        else{
                            System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);}
                    }
                    else {
                        System.out.println("Error: Invalid input. Terminating Program.");
                        System.exit(0);
                    }
                }
                else {
                    System.out.println("Error: Invalid input. Terminating Program.");
                    System.exit(0);
                }

            }
            else {
                System.out.println("Error: Invalid input. Terminating Program.");
                System.exit(0);
            }
        }
        else {
            System.out.println("Error: Invalid input. Terminating Program.");
            System.exit(0);
        }
    
    }
}