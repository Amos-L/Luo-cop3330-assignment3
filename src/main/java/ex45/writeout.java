/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex45;

import java.io.FileWriter;
import java.io.IOException;

public class writeout {
    public void output(String newString){

        //Create file
        String path = "src/main/java/ex45/exercise45_output.txt";
        try {
            FileWriter output = new FileWriter(path);

            //Write sorted string into file
            output.write(newString);

            //Close to save file
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
