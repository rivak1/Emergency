package get2019.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = null;
		LinkedList LinkedListObj  =  new LinkedList();
		if(LinkedListObj.head == null) {
			n1 = LinkedListObj.insert(1);
			LinkedListObj.head  = n1;
		}
		n1.next =  LinkedListObj.insert(2);
		n1.next.next =  LinkedListObj.insert(3);
		n1.next.next.next =  LinkedListObj.insert(4);
		n1.next.next.next.next =  LinkedListObj.insert(5);
		n1.next.next.next.next.next =  LinkedListObj.insert(6);
		
		LinkedListObj.printList(n1);
		LinkedListObj.rotateList(n1,3,6);
		LinkedList LinkedListObj1  =  new LinkedList();
		if(LinkedListObj1.head == null) {
			n1 = LinkedListObj1.insert(1);
			LinkedListObj1.head  = n1;
		}
		n1.next =  LinkedListObj1.insert(2);
		n1.next.next =  LinkedListObj1.insert(3);
		n1.next.next.next =  LinkedListObj1.insert(4);
		n1.next.next.next.next =  n1.next.next.next;
		//n1.next.next.next.next.next =  LinkedListObj1.insert(6);
		//n1.next.next.next.next.next.next  = LinkedListObj1.insert(7); 
		LinkedListObj1.checkLoop(n1);
		
	}

}
