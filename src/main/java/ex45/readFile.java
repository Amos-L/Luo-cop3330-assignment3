/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {

    private Scanner x;

    public String readFiles() {

        //Store file inputs into array string
        ArrayList<String> fileInput = new ArrayList<String>();
        String path = "src/main/java/ex45/exercise45_input.txt";
        File file = new File(path);

        try {
            //Scan and add into different array strings for each line
            x = new Scanner(file);
            while (x.hasNext()) {
                String inputs = x.nextLine();
                fileInput.add(inputs);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        x.close();

        //Join the arraylist into one big string
        String listString = String.join("\n", fileInput);
        return listString;
    }
}



