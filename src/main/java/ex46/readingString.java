/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class readingString {

    public static Map<String, Integer> readString() {
        Map<String, Integer> holder = new TreeMap<String, Integer>();
        try {
            Scanner x = new Scanner(new File("src/main/java/ex46/exercise46_input.txt"));
            while (x.hasNextLine()) {
                String input = x.next();

                //Scans user input, for every different word, make section in Map
                if (holder.containsKey(input))
                    holder.put(input, holder.get(input) +1);
                else {
                    holder.put(input, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("NO FILE");

        }
        return holder;
    }
}
