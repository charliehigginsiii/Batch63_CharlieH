package com.cogent;

public class LinkedLists {
	Node Head;
	LinkedLists(){
		this.Head=null;
	}
	public class Node{
		Node next;
		int num;
		public Node(int num) {
			this.next=null;
			this.num=num;
		}
	}
	public void insertend(int number) {
		if(this.Head==null) {
			this.Head=new Node(number);
		}else {
			Node current=Head;
			while(current.next!=null) {
				current.next=current;
			}
			current.next=new Node(number);
		}
	}
	public void display() {
		Node temp=Head;
		while(temp!=null) {
			System.out.println(temp.num);
			temp=temp.next;
		}
	}
	public static void main(String[]args) {
		LinkedLists obj=new LinkedLists();
		obj.insertend(9);
		obj.insertend(4);
		obj.display();
	}
}
