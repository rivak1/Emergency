package DSA3;

class EmpNode {
	String name;
	int age;
	int salary;
	EmpNode nextEmployee;

	EmpNode(String name, int age, int salary) {
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.nextEmployee = null;
	}
}

public class Employees {

	EmpNode headEmloye = null;
	EmpNode sorted;

	void insertIntoEmployee(String name, int salary, int age) {
		EmpNode newNode = new EmpNode(name, age, salary);
		if (headEmloye == null) {
			headEmloye = newNode;
		} else {
			EmpNode Temp = headEmloye;
			while (Temp.nextEmployee != null) {
				Temp = Temp.nextEmployee;
			}
			Temp.nextEmployee = newNode;
		}
	}

	void printList() {
		EmpNode temp = this.headEmloye;
		while (temp != null) {
			System.out.println(temp.name + " = name" + " - age = " + temp.age + " - salary = " + temp.salary);
			temp = temp.nextEmployee;
		}
	}

	void insertionSort(EmpNode headref)  
    { 
        // Initialize sorted linked list 
        sorted = null; 
        EmpNode current = headref; 
        // Traverse the given linked list and insert every 
        // node to sorted 
        while (current != null)  
        { 
            // Store next for next iteration 
        	EmpNode next = current.nextEmployee; 
            // insert current in sorted linked list 
            sortedInsert(current); 
            // Update current 
            current = next; 
        } 
        // Update head_ref to point to sorted linked list 
        this.headEmloye = sorted; 
    } 
  
    /* 
     * function to insert a new_node in a list. Note that  
     * this function expects a pointer to head_ref as this 
     * can modify the head of the input linked list  
     * (similar to push()) 
     */
    void sortedInsert(EmpNode newnode)  
    { 
        /* Special case for the head end */
        if (sorted == null || sorted.salary <= newnode.salary)  
        { 	//System.out.println(sorted);
            newnode.nextEmployee = sorted; 
            sorted = newnode; 
        } 
        else 
        { 
        	EmpNode current = sorted; 
            /* Locate the node before the point of insertion */
            while (current.nextEmployee != null && current.nextEmployee.salary > newnode.salary)  
            { 
                current = current.nextEmployee; 
            } 
            newnode.nextEmployee = current.nextEmployee; 
            current.nextEmployee = newnode; 
        } 
    } 
  

	public static void main(String args[]) {
		Employees E = new Employees();
		E.insertIntoEmployee("R", 2, 13);
		E.insertIntoEmployee("i", 1, 11);
		E.insertIntoEmployee("v", 3, 12);
//		E.insertIntoEmployee("a", 4, 14);
//		E.insertIntoEmployee("k", 5, 13);
//		E.insertIntoEmployee("s", 6, 15);
		// E.printList();
		E.insertionSort(E.headEmloye);
		E.printList();
	}
}
