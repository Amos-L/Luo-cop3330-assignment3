/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readingFile {
    //Creating function that reads the input file
    public static ArrayList<String> readInput(){

        //Creating array list to store all the names
        ArrayList<String> listOfNames = new ArrayList<>();

        //Need to use try since file reading can throw out errors.
        try {
            File inf = new File("src/main/java/ex41/exercise41_input.txt"); //Opening file
            Scanner x = new Scanner(inf);
            while (x.hasNextLine()) { //Scanning each line until there is an empty line
                listOfNames.add(x.nextLine()); //Store in array list
            }
            return listOfNames;
        }
        catch(FileNotFoundException e){ //If file cannot be found, print error message
            System.out.println("File does not exist.");
        }
        return listOfNames;
    }
}
