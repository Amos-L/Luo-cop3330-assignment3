/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex41;

import java.util.ArrayList;

public class ex41 {

    public static void main(String[] args) throws Exception {

        //Creating reference to function from other classes
        readingFile scanner = new readingFile();
        sortArray sorting = new sortArray();
        writingOutput output = new writingOutput();

        //Calling function and storing in this main
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames = scanner.readInput();
        ArrayList<String> sortedlist = new ArrayList<>();
        sortedlist = sorting.sortList(listOfNames);

        //Calling output function to make file
        output.writeOutput(sortedlist);

    }
}
