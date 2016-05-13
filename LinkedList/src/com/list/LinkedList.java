package com.list;

public class LinkedList {



	/**
	 * singly linked list
	 * @author ramkumarsundarajan
	 *
	 */
	class Node {
		int data;
		Node next;
	}

	/**
	 * recursive deletion of a node at given position.
	 * @param head
	 * @param position
	 * @return
	 */
	public Node delete(Node head, int position) {
		// Complete this method
		if(head == null) return null;
		if(position == 0) return head.next;

		head.next = delete(head.next,position-1);
		return head;
	}

	/**
	 * print all elements in the linkedlist.
	 * @param head
	 */
	public void print(Node head) {

		if(head!=null){

			System.out.println(head.data);
			print(head.next);
		}
	}

	/**
	 * print the elements of linked list in reverse
	 * @param head
	 */
	public void reversePrint(Node head) {

		if(head !=null ){
			if(head.next!=null){    
				reversePrint(head.next);
			} 
			System.out.println(head.data);
		}
	}

	/**
	 * reverse linked list.
	 * @param head
	 * @return
	 */
	public Node reverse(Node head) {  

		if(head == null || head.next == null) return head;
		Node node = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return node;	       
	}



}
