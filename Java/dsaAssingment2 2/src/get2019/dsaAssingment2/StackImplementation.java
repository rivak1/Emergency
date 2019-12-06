package get2019.dsaAssingment2;

class Node {

	String data;
	Node next;
	int data1;

	Node(String data) {
		this.data = data;
		this.next = null;
	}
	Node(int data1){
		this.data1 = data1;
		this.next = null;
	}
}

public class StackImplementation implements Stack {

	Node top;
	Node Operator;
	Node Operator1;
	Node Operand;

	StackImplementation() {
		this.top = null;
	}

	@Override
	public void push(String data) {
		Node newNode = new Node(data);
		if (this.isEmpty()) {
			this.top = newNode;
		} else {
			Node temp;
			temp = this.top;
			this.top = newNode;
			newNode.next = temp;
		}
	}

	public void pushOperator(String data) {
		Node newNode = new Node(data);
		if (this.isEmptyForOperator()) {
			this.Operator = newNode;
		} else {
			Node temp;
			temp = this.Operator;
			this.Operator = newNode;
			newNode.next = temp;
		}
	}
	public void pushOperator1(String data) {
		Node newNode = new Node(data);
		if (this.isEmptyForOperand()) {
			this.Operator1 = newNode;
		} else {
			Node temp;
			temp = this.Operator1;
			this.Operator1 = newNode;
			newNode.next = temp;
		}
	}

	public void pushOperand(int n) {
		Node newNode = new Node(n);
		if (this.isEmptyForOperand()) {
			this.Operand = newNode;
		} else {
			Node temp;
			temp = this.Operand;
			this.Operand = newNode;
			newNode.next = temp;
		}
	}

	@Override
	public void pop() {
		top = top.next;
	}

	public void popForOperator() {
		Operator = Operator.next;
	}
	
	public void popForOperator1() {
		Operator1 = Operator1.next;
	}

	public void popForOperand() {
		Operand = Operand.next;
	}

	@Override
	public String peak() {
		String data = this.top.data;
		return data;
	}

	public String peakForOperator() {
		String data = this.Operator.data;
		return data;
	}
	
	public String peakForOperator1() {
		String data = this.Operator1.data;
		return data;
	}

	public String peakForOperand() {
		String data = this.Operand.data;
		return data;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	public boolean isEmptyForOperand() {
		return this.Operand == null;
	}

	public boolean isEmptyForOperator() {
		return this.Operator == null;
	}
	
	public boolean isEmptyForOperator1() {
		return this.Operator1 == null;
	}

	@Override
	public void display() {
		Node temp = this.top;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	public void display1() {
		Node temp = this.Operator;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	int checkPriority(String data) {

		if (data == "^") {
			return 3;
		} else if (data == "+" || data == "-") {
			return 1;
		} else if (data == "*" || data == "/") {
			return 2;
		} else {
			return -1;
		}

	}

	int checkLetterOrDigitBracket(String data) {
		if (data.charAt(0) >= 42 && data.charAt(0) <= 47) {
			return 1;
		} else if (data.charAt(0) == '^') {
			return 1;
		} else if (data.charAt(0) >= 48 && data.charAt(0) <= 57) {
			return 2;
		} else if (data.charAt(0) == '(') {
			return 3;
		} else {
			return -1;
		}
	}

	void convertToPostfix() {
		Node temp = this.top;
		int max = -1;
		String result ="";
		while (temp != null) {
			if (this.checkLetterOrDigitBracket(temp.data) == 1) {
				if (this.isEmptyForOperator()) {
					System.out.println();
					this.display1();
					this.pushOperator(temp.data);
				} else {
					
					while((this.checkPriority(this.peakForOperator()) >= this.checkPriority(temp.data))){
						result = result+this.peakForOperator()+" ";
						this.popForOperator();
						if(this.isEmptyForOperator()){
							break;
						}
					}
					this.pushOperator(temp.data);
				}
			} else if (this.checkLetterOrDigitBracket(temp.data) == 2) {
				//this.pushOperator(temp.data);
				result = result+temp.data+" ";
			} else if (this.checkLetterOrDigitBracket(temp.data) == 3) {
				this.pushOperator(temp.data);
			} 
			else if (this.checkLetterOrDigitBracket(temp.data) == -1) {
				while (!this.isEmptyForOperator()
						&& this.peakForOperator() != "(") {
					result = result+ this.peakForOperator()+" ";
					this.popForOperator();
				}
				this.popForOperator();
			}
			temp = temp.next;

		}
		System.out.println();
		result = result+this.peakForOperator();
		System.out.println(result);
		this.popForOperator();
		this.evalutionOperation(result);
	}

	private void evalutionOperation(String result) {
		String subString="";
		String operator;
		for (int i = 0; i < result.length(); i++) {
			subString = "";
			if(result.charAt(i) != ' '){
				subString = subString + result.charAt(i);
			}
			
			if(subString.charAt(0) >= 42 && subString.charAt(0) <= 47){
				
				if(this.isEmptyForOperator1()){
					this.pushOperator1(subString);
				}
				else{
					while(this.checkPriority(this.peakForOperand()) > this.checkPriority(subString)){
						operator = this.peakForOperator1();
						this.popForOperator();
						//System.out.println(operator);
						switch(operator){
							
						case "*":
							System.out.println("mul");
							break;
						
						case "-":
							System.out.println("-");
							break;
						case "+":
							System.out.println("+");
							break;
						
						case "/":
							System.out.println("/");
							break;
						}
					}
				}
			}
			else
			{
			
				int n =0;
				for (int j = 0; j < subString.length(); j++) {
					n = n * 10 + (subString.charAt(i) - 48);
				}
				this.pushOperand(n);
			}
		}
	}

}
