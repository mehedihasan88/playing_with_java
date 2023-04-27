package com.mehedi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //input
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        //date time
//        LocalDateTime time =  LocalDateTime.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
//        String formattedTime = time.format(format);

        //output
//        System.out.println("hello java madafaka says " + time + " " + formattedTime);

        //error handelling
        try{
            ArrayList<Integer> animals = new ArrayList<Integer>(3);
            animals.add(1);
            if(animals.size() >= 1) {throw new ArrayIndexOutOfBoundsException("Array Index is out madafaka");}
            System.out.println(animals.get(1));
        }
        catch(Exception e) {
            System.out.println(e);
        }
            System.out.println("hello madafakas");
    }
}
