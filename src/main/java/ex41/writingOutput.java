/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writingOutput {
    public static void writeOutput(ArrayList<String> listOfNames){

        try{
            //Creating output file and determining the path for output file
            FileWriter writer = new FileWriter("src/main/java/ex41/exercise41_output.txt");
            //Writing the header
            writer.write("Total of " + listOfNames.size() + " names\n-----------------\n");

            //Looping through the number of names and printing them
            for(int i=0; i<listOfNames.size();i++){
                writer.write(listOfNames.get(i) + "\n");
            }
            //Closing file so it saves
            writer.close();
        }
        catch(IOException e){ //If function can't write, prints out error message
            System.out.println("I/O Error.");
        }
    }
}
