package com.LinkedList;
import com.LinkedList.LinkedList.Node;
	
public class insertList {
		public static void main(String args[])
		{
			LinkedList linkedList = new LinkedList();
			linkedList.append(56);
			linkedList.append(30);
			
			
			linkedList.insertAfter(linkedList.head.next, 70);
			linkedList.printList();
		
		}
	}
	class LinkedList
	{
		Node head;
		
		class Node
		{
			int data;
			Node next;
			
			Node(int data)
			{
				this.data = data;
				next = null;
			}
		}
		
		public void printList() {
			System.out.println("List : ");
			Node temp = head;
			
			while(temp != null) {
				System.out.print(temp.data+ "->");
				temp = temp.next;
			}
		}
		
		public void append(int data)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
				return;
			}
			
			Node last = head;
			while(last.next!= null)
			{
				last = last.next;
			}
			last.next = newNode;
		}

		 public void insertAfter(Node prevNode,int data)
		 {
			if(prevNode == null)
			{
				System.out.println("previous node should not be null");
				return;
			}
			Node newNode = new Node(data);
			newNode.next = prevNode.next;
			prevNode.next =newNode;
		 	}
		}






