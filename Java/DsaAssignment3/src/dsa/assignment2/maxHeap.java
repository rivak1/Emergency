package dsa.assignment2;

class maxHeap

{
	private int maxSize;
	private int[] heap;
	private int size;

	maxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.heap = new int[this.maxSize + 1];
		this.size = 0;
		this.heap[0] = Integer.MAX_VALUE;
	}

	int getParent(int pos) {
		return pos / 2;
	}

	int getLeft(int pos) {
		return pos * 2;
	}

	int getRight(int pos) {
		return (pos * 2) + 1;
	}


	void swap(int pos1, int pos2) {
		int temp = this.heap[pos1];
		this.heap[pos1] = this.heap[pos2];
		this.heap[pos2] = temp;
		return;
	}
	

	void add(int newData) {
		this.heap[++this.size] = newData;
		int curr = this.size;

		while (this.heap[curr] >= this.heap[getParent(curr)]) {
			swap(curr, getParent(curr));
			curr = getParent(curr+1);
		}
	}

	private void maxHeapify(int pos) 
    { 

        if (heap[pos] < heap[getLeft(pos)] ||   heap[pos] < heap[getRight(pos)]) {
        	
            if (heap[getLeft(pos)] > heap[getRight(pos)]) { 
                swap(pos,getLeft(pos)); 
                pos = getLeft(pos);
                maxHeapify(pos); 
            } 
            
            else { 

            	swap(pos, getRight(pos)); 
            } 
        } 
    } 
  
	int delete() {
		int targetData = this.heap[1];
		this.heap[1] = this.heap[size--];
		int curr = 1;
		this.maxHeapify(curr);
		return targetData;
	}


	void printTree() {
		for (int i = 1; i <= this.size / 2; i++) {
			System.out.println("Node : " + this.heap[i]);
			System.out.println("Left Child : " + this.heap[getLeft(i)]);
			System.out.println("Right Child : " + this.heap[getRight(i)]);
		}
		System.out.println("___________________________________");
	}

	void deleteHeap() {
		this.heap = null;
		return;
	}

	int size() {
		return this.size;
	}
	
	
	public static void main(String args[]){
		maxHeap maxHeap = new maxHeap(15);
		maxHeap.add(3);
		maxHeap.add(2);
		maxHeap.add(1);
		maxHeap.printTree();
		int top = maxHeap.delete();
		while(top != 0){
			System.out.println(top+"Bolwer done by");
			top = top -1;
			maxHeap.add(top);
			top = maxHeap.delete();
		}
	

	}
}
