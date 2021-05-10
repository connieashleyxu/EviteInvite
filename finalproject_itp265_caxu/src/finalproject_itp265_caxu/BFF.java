package finalproject_itp265_caxu;

/**
 * Write a description of class BFF here.
 *
 * @author Connie Xu
 * @version April 21, 2021
 */
import java.util.*;

/**
 * This class is meant to serve ITP 265 students as a help for getting input and error checking on input, but
 * may also be used as a general purpose class to store methods which may be needed across lots of projects.
 *
 * @author Kendra Walther and Connie Xu
 * @version Spring 2021 

 */
public class BFF
{
    private Scanner sc;

    /**
     * Constructor sets up a Scanner to be used by the class in order to read input from the standard console window (System.in)
     */
    public BFF() {
        sc = new Scanner(System.in);
    }

    /**
     * Prompt the user and read one word of text as a String
     * @param prompt: the question to ask the user
     * @return: a one word String - if the user enters multiple words, all other input until the return will be discarded.
     */
    public String inputWord(String prompt) {
        System.out.print(prompt + "\n>");
        String word = sc.next();
        sc.nextLine(); // remove any "garbage" (like extra whitespace or the return key) after the one word that is read in
        return word;
    }

    /**
     * Prompt the user and read one line of text as a String
     * @param prompt: the question to ask the user
     * @return: a line of user input (including spaces, until they hit enter)
     */
    public String inputLine(String prompt) {
        System.out.print(prompt + "\n>");
        return sc.nextLine();
    }

    /**
     * Prompt the user and read an int, clearing whitespace or the enter after the number
     * @param prompt: the question to ask the user 
     * @return: an int 
     */
    public int inputInt(String prompt) {
        System.out.print(prompt + "\n>");
        // if scanner does not see an int, get rid of garbage and ask again.
        while(! sc.hasNextInt()){
            String garbage = sc.nextLine(); // pipe has stuff that is not an int, get rid of it.
            System.err.println(garbage + " was not an int.");
            System.out.print(prompt + "\n>");
        }
        int num = sc.nextInt();

        sc.nextLine(); // get rid of the enter

        return num;
    }

    /**
     * Prompt the user and read an int between (inclusive) of minValue and maxValue, clearing whitespace or the enter after the number
     * @param prompt: the question to ask the user 
     * @return: an int between minValue and maxValue
     */
    public int inputInt(String prompt, int minValue, int maxValue) {
        int num = inputInt(prompt); // call the previous method to get a int number DON't REPEAT CODE
        // DRY - don't repeat yourself
        while(num < minValue || num > maxValue) { // num is no good.... 
            System.out.println(num + " was not in the allowed range " + minValue + " - " + maxValue);
            num = inputInt(prompt); // get a new number
        }
        return num;
    }

    /**
     * Prompt the user and read a floating point number, clearing whitespace or the enter after the number
     * @param prompt: the question to ask the user 
     * @return: a double value 
     */
    public double inputDouble(String prompt) {
        System.out.print(prompt + "\n>");
        // if scanner does not see an intdouble, get rid of garbage and ask again.
        while(! sc.hasNextDouble()){
            String garbage = sc.nextLine(); // pipe has stuff that is not an int, get rid of it.
            System.err.println(garbage + " was not an floating point number.");
            System.out.print(prompt + "\n>");
        }
        double num = sc.nextDouble();

        sc.nextLine(); // get rid of the enter

        return num;
    }

    /**
     * Prompt the user and read a floating point number between (inclusive) of min and max, 
     * clearing whitespace or the enter after the number
     * @param prompt: the question to ask the user 
     * @return: a double value 
     */
    public double inputDouble(String prompt, double min, double max) {
        double num = inputDouble(prompt); // call the previous method to get a int number DON't REPEAT CODE
        // DRY - don't repeat yourself
        while(num < min || num > max) { // num is no good.... 
            System.out.println(num + " was not in the allowed range " + min + " - " + max);
            num = inputDouble(prompt); // get a new number
        }
        return num;
    }

    /**
     * Prompt the user and read a boolean value, clearing whitespace or the enter after the number
     * @param prompt: the question to ask the user 
     * @return: a boolean value 
     */
    public boolean inputBoolean(String prompt) {
        System.out.print(prompt + "\n>");
        // if scanner does not see an boolean, get rid of garbage and ask again.
        while(! sc.hasNextBoolean()){
            String garbage = sc.nextLine(); // pipe has stuff that is not an boolean, get rid of it.
            System.err.println(garbage + " was not an boolean. please enter \"true\" or \"false\"");
            System.out.print(prompt + "\n>");
        }
        boolean b = sc.nextBoolean();

        sc.nextLine(); // get rid of the enter

        return b;
    }


    /**
     * Prompt the user enter yes or no (will match y/yes and n/no any case) and return true for yes and false for no.
     * @param prompt: the question to ask the user 
     * @return: a boolean value 
     */
    public boolean inputYesNo(String prompt) {
        //TODO -- you should be able to write this (and all methods in this class on your own!)
        boolean goodInput = false;
        boolean answer = true;  // local variable for the answer

        while ( !goodInput){
            String yesNo = inputWord(prompt);
            if(yesNo.equalsIgnoreCase("yes") || 
            yesNo.equalsIgnoreCase("y")){
                goodInput = true;
                answer = true; 
            }
            else if(yesNo.equalsIgnoreCase("no") ||
            yesNo.equalsIgnoreCase("n")){
                goodInput = true;
                answer = false;
            }
            else{
                goodInput = false;
                System.err.println(yesNo + " was no recongized as valid y/n input");
            }
        } 

        return answer; 
    }


    public void print(String msg){
        System.out.println(msg);   
    }

    public void printFancy(String msg){
        System.out.println("********************************");
        System.out.println(msg);   
        System.out.println("********************************");
    }
}