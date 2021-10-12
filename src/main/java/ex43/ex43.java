/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Amos Luo
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex43 {

    public static void prompt() {

        String siteName, author, JS, CSS;
        boolean javaS, CSSvalue;

        Scanner input = new Scanner(System.in);
        System.out.print("Site name: "); //Asking for user input
        siteName = input.nextLine();

        System.out.print("Author: ");
        author = input.nextLine();

        System.out.print("Do you want a folder for JavaScript?: ");
        JS = input.nextLine();

        if(JS.contains("Y") || JS.contains("y")) { //If "yes" make boolean value true
            javaS = true;
        }
        else{
            javaS = false;
        }
        System.out.print("Do you want a folder for CSS?: ");
        CSS = input.nextLine();

        if(CSS.contains("Y") || CSS.contains("y")){ //If "yes" make boolean value true
            CSSvalue = true;
        }
        else{
            CSSvalue = false;
        }
        makeMain(siteName,author,javaS,CSSvalue); //Run into main function to make folders
    }

    public static void makeMain(String siteName, String author, boolean javaS, boolean CSSvalue){

        //Creating the main folder for the website
        String path = "src/main/java/ex43/website/" + siteName;
        File file = new File(path);
        file.mkdirs();

        //Creating the html file, using try if it runs into error
        try {
            //Creating HTML File
            FileWriter writer = new FileWriter(path + "/index.html");

            //Writing HTML index header with author and site name
            writer.write("\t\t<title>" + siteName + "</title>\n");
            writer.write("<meta>" +author+ "</meta>");
            writer.close();

            //If user wanted javaS
            if(javaS == true){
                //Make file using sorted sitename
                String pathJSS = "src/main/java/ex43/website/" + siteName + "/js";
                File fileJS = new File(pathJSS);
                fileJS.mkdir();
            }
            //If user wanted CSS
            if(CSSvalue == true){
                //Same as javaS section
                String pathCSS = "src/main/java/ex43/website/" + siteName + "/css";
                File fileCSS = new File(pathCSS);
                fileCSS.mkdir();
            }

        } catch (IOException e) {
            System.out.println("I/O Error.");
        }
        printOutput(siteName, author, javaS,CSSvalue);
    }

    public static void printOutput(String siteName, String author, boolean javaS, boolean CSSvalue) {

        System.out.printf("Created ./website/%s\n", siteName);
        System.out.printf("Created ./website/%s/index.html\n", siteName);
        if(javaS == true){
            System.out.printf("Created ./website/%s/js/\n", siteName);
        }

        if(CSSvalue == true){
            System.out.printf("Created ./website/%s/css/\n", siteName);
        }

    }

    public static void main(String[] args){
        prompt();
    }
}
