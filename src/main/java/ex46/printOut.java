/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex46;

import java.util.Map;

public class printOut {

    public static String print(Map<String, Integer> readString) {

    //Used for test case
    String result = "DONE";

    for(String key :readString.keySet())
    {
        //Print out the unique word
        System.out.printf("%s", key + ": ");

        //Print the number of times it occurred from scanning
        int j = readString.get(key);
        for (int i = 0; i < j; i++)
            System.out.printf("*");
            System.out.printf("\n");
    }
        return result;
    }
}
