package com.java.datastructure.LinkedList;


import java.util.Scanner;

// add first, add last, delete by index, reverse linked list(not done),Sort a linked list
public class Assignment {
    class  Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail=null;

//Add First.
    public void addNodeFirst(int data) {
        //Create a new node
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;

    }

    public void addNodeLast(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail=newNode;
        }
    }



    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
//            return;
        }else {
            System.out.println("Nodes of linked list: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void deleteByIndex(int index){
        if (head==null){
            System.out.println("List is EMpty");
        }else{
            Node prev =null,curr=head;
            int key=1;
            while (curr != null && key != index) {
                prev = curr;
                curr = curr.next;
                key++;
            }
            if (curr==null){
                System.out.println("Index not found.");
            }else {
                System.out.println("Deleting "+ curr.data+"...");
                prev.next=curr.next;
//                curr=null;
            }
        }
    }
    public void sortList() {
        Node current = head, index;
        int temp;
        if (head == null) {
//            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            System.out.println("List is Sorted");
        }
    }



    public static void main(String[] args) {
        Assignment list=new Assignment();
        Scanner sc=new Scanner(System.in);
        int value=0;
        int input;
        while(value !=10){
            System.out.println("1  )Insert at first\n2  )Insert at Last\n3  )Display\n4  )Delete at Index\n5  )Sort the List\n10 )Exit");
            System.out.println("Enter your choice: ");
            value=sc.nextInt();

            switch (value){
                case 1:
                    System.out.println("Enter the data :");
                    input=sc.nextInt();
                    list.addNodeFirst(input);
                    break;
                case 2:
                    System.out.println("Enter the data: ");
                    input=sc.nextInt();
                    list.addNodeLast(input);
                    break;
                case 3:
                    System.out.println("Displaying...");
                    list.display();
                    break;
                case 4:
                    System.out.println("Enter the index: ");
                    input=sc.nextInt();
                    list.deleteByIndex(input);
                    break;
                case 5:
                    list.sortList();
                    break;


                case 10:
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;

            }
        }
    }
}
