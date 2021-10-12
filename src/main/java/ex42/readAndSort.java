/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readAndSort {

    public static String readInput(){
        String result = "done!"; //For test case result
        String error = "FILE ERROR";
        System.out.printf("Last      First     Salary\n--------------------------\n");
        //Need to use try since file reading can throw out errors.
        try {
        File inf = new File("src/main/java/ex42/exercise42_input.txt"); //Opening file
        Scanner x = new Scanner(inf);

        //Creating string to hold input strings
        String infoList;
        String[] parsing = new String[0];
        while (x.hasNextLine()) { //Scanning each line until there is an empty line
            infoList = x.nextLine(); //Store in array list
            //Parsing using "," as an indicator
            parsing = infoList.split(",");
            System.out.printf("%-11s%-11s%-11s\n", parsing[0], parsing[1], parsing[2]);
        }
    }
        catch(
    FileNotFoundException e){ //If file cannot be found, print error message
        System.out.println("File does not exist.");
        return error;
    }
        return result;
    }
}
