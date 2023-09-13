package com.example.dsp1;

public class Student {

    int seatnum;
    String branch;
    double average;

    public Student(){

    }

    public Student(int seatnum, String branch, double average){
        this.seatnum=seatnum;
        this.branch=branch;
        this.average=average;
    }

    public int getSeatnum() {return seatnum;}
    public String getBranch() {return branch;}
    public double getAverage() {return average;}

    @Override
    public String toString() {
        return "Student{" +
                "seatnum=" + seatnum +
                ", branch='" + branch + '\'' +
                ", average=" + average +
                '}';
    }


}
