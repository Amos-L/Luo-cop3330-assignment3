/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex44 {
    public static String prompt(){

        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("exercise44_input.json"));

            Products productList = gson.fromJson(br , Products.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.print("What is the product name? "); //Asking for user input
        String item = input.nextLine();
        //if()
        String string = null;
        return null;
    }

}
