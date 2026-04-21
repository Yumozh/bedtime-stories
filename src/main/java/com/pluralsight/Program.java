package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What story do you wan to read today? ");
        String storyName = scan.nextLine();

        printStory(storyName);

    }

    private static void printStory(String storyName) {
        try {
            FileReader fileReader = new FileReader(storyName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input = bufferedReader.readLine();
            int i = 1;
            while(input != null){
                System.out.println(i+"." + input);
                input = bufferedReader.readLine();
                i ++;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("The file could not be read. Please make sure the file is available and not locked and then try again.");
            throw new RuntimeException(e);
        }
    }
}
