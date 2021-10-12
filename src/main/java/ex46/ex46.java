/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex46;

import java.util.Map;

public class ex46 {
    public static void main(String[] arg) {
        readingString sort = new readingString();
        printOut prompt = new printOut();
        Map<String, Integer> input = sort.readString();
        prompt.print(input);
    }
}
