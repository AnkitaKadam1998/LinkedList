package com.LinkedList;

class Node {
    int data;
    Node next;
};

class LinkedList5 {
  Node head;

  LinkedList5(){
    head = null;
  }

  //Add new element at the end of the list
  public void push_back(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null; 
    if(head == null) {
      head = newNode;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
    }    
  }

  //Delete first node of the list
  public void pop_front() {
    if(this.head != null) {
      Node temp = this.head;
      this.head = this.head.next;
      temp = null;  
    }
  }

  //display the content of the list
  public void PrintList() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
};


public class DeleteFirstElement{ 
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();

    
    MyList.push_back(56);
    MyList.push_back(30);
    MyList.push_back(70);
    
    MyList.PrintList(); 

    //Delete the first node
    MyList.pop_front();
    MyList.PrintList();  
  }
}




