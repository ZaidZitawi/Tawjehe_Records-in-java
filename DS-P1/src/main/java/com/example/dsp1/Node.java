package com.example.dsp1;

public class Node {

    public Node next;
    public int seatnum;
    public String branch;
    public double average;
    Student student = new Student(seatnum, branch, average);



    public Node(Student student){
        this.student=student;
    }
    public Node(Student student, Node next){
        this.student=student;
        this.next=next;

    }
}
