package com.example.dsp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Captain {
    public static void main(String[] args) {
//        System.out.println("===================West Bank====================");
        LinkedList W = new LinkedList();
        LinkedList G = new LinkedList();
//        W = ReadWestData();
//        W.print();
        System.out.println("===================Gaza====================");
        G = ReadGazaData();
        G.print();
//        Addstu(1203101, "Scientific", 88, "West Bank", G);

    }

    public static LinkedList ReadWestData() {
        LinkedList lf = new LinkedList();
        Node current = lf.front;

        File Ffile = new File("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1-LinkedL\\src\\West Bank");
        try {
            Scanner input = new Scanner(Ffile);
            int i = 0;
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tokens = s.split(",");
                if (tokens.length == 3) {
                    int seatnum = Integer.parseInt(tokens[0]);
                    String branch = tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    String area = "West Bank";
                    lf.addFirst(new Student(seatnum, branch, score));

//                    lf.SortFlightwhileReading(lf, FlightNumber, AirLineName, Source,Destination , Capacity);//Sort doesn't work
                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return lf;
    }


    public static LinkedList ReadGazaData() {
        LinkedList lf = new LinkedList();
        Node current = lf.front;

        File Ffile = new File("C:\\Users\\DELL\\IdeaProjects\\demo\\DS-P1-LinkedL\\src\\Gaza");
        try {
            Scanner input = new Scanner(Ffile);
            int i = 0;
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] tokens = s.split(",");
                if (tokens.length == 3) {
                    int seatnum = Integer.parseInt(tokens[0]);
                    String branch = tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    String area = "Gaza";
                    lf.addFirst(new Student(seatnum, branch, score));

//                    lf.SortFlightwhileReading(lf, FlightNumber, AirLineName, Source,Destination , Capacity);//Sort doesn't work


                }
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return lf;
    }



//    public static void Addstu(int seatnum, String branch, double average, String area, LinkedList l) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Student Data with commas between them[Seat number, Branch, Average, Area: ");
//        while (input.hasNext()) {
//            String s = input.nextLine();
//            String[] tokens = s.split(",");
//            if (tokens.length == 4) {
//                seatnum = Integer.parseInt(tokens[0]);
//                branch = tokens[1];
//                average = Double.parseDouble(tokens[2]);
//                area = tokens[3];
//
//            }
//        }
//        Student s = new Student(seatnum, branch, average, area);
//        l.addFirst(s);
//
//    }
}
