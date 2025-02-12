package com.amigoscode.workingwithfiles;

import java.io.*;
import java.util.Scanner;

public class WorkingToFiles {

    // create a file

    public static File createFile(){
        File file = new File("java/src/foo.txt");
        System.out.println(file.getAbsoluteFile());

        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println(" New File created at  "+file.getAbsolutePath());
                return file;
            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
                throw new RuntimeException("File Not Created");
            }
        }
        else
        System.out.println("File Already Exists.... ");

        return file;
    }

    // writing into file
    public static void writingToFile(File file,boolean append){
        try(
                FileWriter fw = new FileWriter(file,append);
                PrintWriter pw = new PrintWriter(fw);
                ){
                    pw.println("Bonita");
        }catch (IOException e){
            e.printStackTrace();
        }

       /* try{
                // append add content without remove previous one
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Tahir ");
            printWriter.println();
            printWriter.println("oh Yes");
            // to Avoid this below statement flush and close use try resourse
            printWriter.flush();
            printWriter.close();

            System.out.println("This code is run...");
        }catch (IOException e){
           System.out.println( e.getMessage() );

        }*/
    }

    // Reading from file
    public static void readingFromFile(File file){
        try{
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //createFile();
        File file = createFile();
        writingToFile(file,true);
        readingFromFile(file);
    }
}
