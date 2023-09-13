package com.example.dsp1;

public class LinkedList {


    public Node front, back;
    public int size;

    public LinkedList() {
        front = back = null;
        size = 0;
    }

    public int size() {
        return size;
    }


    public void addFirst(Student student) {
        Node newNode = new Node(student);
        if (size == 0) { //empty linked list
            front = back = newNode;
            newNode.next = null;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    public void AddLast(Student student) {
        Node newNode = new Node(student);
        if (size() == 0) {
            front = back = newNode;
            newNode.next = null;
        } else {
            back.next = newNode;
            newNode.next = null;
            back = newNode;
        }
        size++;
    }

    public void Add(int index, Student student) {

        if (index == 0) addFirst(student);

        else if (index >= size()) AddLast(student);

        else {
            Node newNode = new Node(student);
            Node current = front;//Current
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }


    public Object getFirst() {
        if (size == 0) {
            return null;
        } else
            return front.student;
    }

    public Object getLast() {
        if (size == 0) {
            return null;
        } else
            return back.student;
    }


    public void deleteFirst() {
        if (size == 0)
            return;
        else if (size == 1)
            front = back = null;
        else
            front = front.next;
        size--;
    }


    public void deleteLast() {
        Node current = front;
        if (size() == 0)
            return;
        else if (size() == 1)
            front = back = null;
        else {
            for (int i = 0; i < size() - 2; i++) {// the current reaches the node which is before the last one....size()-1 reaches the last one
                current = current.next;
            }
            current.next = null;
            back.next = current;
        }

        size--;
    }

    public void delete(int index) {
        Node current = front;
        if (size == 0)
            return;//empty linkedlist
        else if (index == 0)
            deleteFirst();
        else if (index == size - 1)
            deleteLast();
        else if (index > 0 && index < size - 1) {
            for (int i = 0; i < index - 1; i++)//the same as size-2, it will lead to the previous node from the one wanted to delete
                current = current.next;
            current.next = current.next.next;
        }

        size--;
    }
//    public void delete(int seatnumber) {
//        Node current = front;
//        if (size == 0)
//            return;//empty linkedlist
//        else
//            while (current.next!=null){
//                current = current.next;
//            current.next = current.next.next;
//        }
//        size--;
//    }

    public void Reverse() {
        Node current = front;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        front = prev;
    }

    public int Search(Student student, int seatnum) {
        Node current = front;
        int POS = 0;
        while (current != null) {
            if (current.seatnum == seatnum)
                return POS;
            else
                current = current.next;
            POS += 1;
        }
        return -1;
    }

    public String print() {
        Node curr = front;
        while (curr != null) {
            System.out.println(curr.student);
            curr = curr.next;
        }
        return null;
    }

//    public Object get(int i) {
//        Node current = front;
//        if (size == 0)
//            return null;
//        else if (i == 0)
//            return getFirst();
//        else if (i == size - 1)
//            return getLast();
//        else
//            for (int j = 0; j <= i; i++)
//                current = current.next;
//        return current.element;
//}

//    public String getScoresinfo() {
//        LinkedList l = new LinkedList();
//        StringBuilder WestBankinfo = new StringBuilder();
//
//        try {
//            for (int i = 0; i < l.size(); i++) {
//                WestBankinfo.append(l.get(i).toString()).append("\n");
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array is out of Bounds" + e);
//        }
//        return WestBankinfo.toString();
//    }

    public String toString() {
        String result = "";
        Node current = front;
        while (current.next != null) {
            result += current.student;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        return "List: " + result;
    }

//    public void sortList() {
//
//        // Node current will point to head
//        Node current = front, index = null;
//
//        int temp;
//
//        if (front == null) {
//            return;
//        } else {
//            while (current != null) {
//                // Node index will point to node next to
//                // current
//                index = current.next;
//
//                while (index != null) {
//                    // If current node's data is greater
//                    // than index's node data, swap the data
//                    // between them
//                    if (current.element > index.element) {
//                        temp = current.element;
//                        current.element = index.element;
//                        index.element = temp;
//                    }
//
//                    index = index.next;
//                }
//                current = current.next;
//            }
//        }
//    }
}

//    public void sortList() {
//        //Node current will point to head
//        Node current = front, index = null;
//        int temp;
//
//        if(front == null) {
//            return;
//        }
//        else {
//            while(current != null) {
//                //Node index will point to node next to current
//                index = current.next;
//
//                while(index != null) {
//                    //If current node's data is greater than index's node data, swap the data between them
//                    if(current.element > index.element) {
//                        temp = current.element;
//                        current.element = index.element;
//                        index.element = temp;
//                    }
//                    index = index.next;
//                }
//                current = current.next;
//            }
//        }
//    }




