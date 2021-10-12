/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex45;

public class ex45 {
    public static void main(String[] args){
        //Call required functions
        readFile scanner = new readFile();
        replaceWord replaced = new replaceWord();
        writeout outputfile = new writeout();

        //Store results into strings local and call them within each other
        String input = scanner.readFiles();
        String newString = replaced.replaceWords(input);
        outputfile.output(newString);
    }
}
