package get2019.LinkedList;

import java.util.HashSet;

class Node{
	public Node next;
	public int data;
	Node(){
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head;
	
	public Node insert(int data) {
		return new Node(data);
	}

	public void printList(Node n1) {
	
		while(n1!=null) {
			
			System.out.print(" |__"+n1.data+"__|");
			n1 = n1.next;
		}
		System.out.println();
	}

	public void rotateList(Node n1 , int L , int R) {
		    
		int count = 1;
		Node roation = n1;
		Node next = null;
		Node prev = null;
		Node curr = null;
		Node Last = null;
		Node New1  = new Node();
		while(roation.next != null) {
			
			if(count == L) {
				curr = roation;
				next = roation.next;
			}
			if(count == R-1) {
				Last = roation.next;
				prev = roation;
			}
			
			if(count!= L && count<L) {
				Node temp = New1;
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next = this.insert(roation.data);
			}
			
			roation = roation.next;
			count  = count + 1;
		}
		for (int i = 0; i <1; i++) {
			if(curr == null) {
				System.out.println();
				System.out.println(" No Execution is proced Node is Same positon");
				break;
			}
			else if(next.next == null){
				System.out.println();
				System.out.println(" No Execution is proced For No Element");
				break;
			}
			else if(next.next.next == null) {
				System.out.println();
				System.out.println("Result For Single Element is Same");
				break;
			}
			curr.next = next.next;
			prev.next = next;
			next.next =Last;
			prev = next;
			next = curr.next;
			
		}
		
		Node new2 = New1;
		while(new2.next !=null) {
			new2 = new2.next;
		}
		new2.next = curr;
		New1=New1.next;
		System.out.println();
		this.printList(New1);
	}

	public void checkLoop(Node n1) {
		Node temp1 =n1;
		int flag=-1;
		HashSet<Node> s = new HashSet<Node>(); 
		while(temp1!=null) {
			if(s.contains(temp1)) {
				//System.out.println("true");
				flag=1;
				break;
			}
			else {
				s.add(temp1);
			}
			temp1=temp1.next;
		}
		if(flag == -1) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
	}
}
