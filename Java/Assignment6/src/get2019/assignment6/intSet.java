package get2019.assignment6;

public final class intSet {

	private int size;

	intSet(int size) {

		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isMember(int value, int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {

				return true;
			}
		}
		return false;
	}

	public int sizeOfSet(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = count + 1;
		}
		return count;
	}

	public boolean isSubSet(int[] array, int[] subSet) {

		if (subSet.length == 0) {
			return true;
		} else {
			int count = 0;
			int j = array.length - 1;
			while (count != subSet.length) {

				if (subSet[count] != array[j]) {
					if (j != 0) {
						j = j - 1;
					} else {
						break;
					}
				} else {
					j = array.length - 1;
					count = count + 1;
				}
			}
			if (count == subSet.length) {
				return true;
			} else {
				return false;
			}
		}
	}

	public int[] getComplement(int[] array, int[] subSet) {

		int complementSet[] = new int[array.length - subSet.length];
		if (subSet.length == 0) {
			return subSet;
		} else {
			int count = 0;
			int j = array.length - 1;
			while (count != subSet.length) {
				if (subSet[count] != array[j]) {
					if (j != -1) {
						j = j - 1;
					}
				} else {
					array[j] = -1;
					j = array.length - 1;
					count = count + 1;
				}
			}
			int n = 0;
			for (int i = 0; i < array.length; i++) {

				if (array[i] != -1) {
					complementSet[n] = array[i];
					n = n + 1;
				}
			}
			return complementSet;
		}
	}

	public int[] getUnion(int[] set1, int[] set2) {
		int n=0;
		int k=0;
		int unionSet[] = new int[set1.length + set2.length];
		for (int i = 0; i < set1.length; i++) {
			unionSet[i] = set1[i];
			}
		int count=0;
		while(set2.length != count) {
			
			if(unionSet[n] != set2[count]) {
				n=n+1;
				if(n == unionSet.length-1) {
					unionSet[set1.length+count] =set2[count];
					count =count+1;
					n=0;
				}
			}else {
				count=count+1;
				n=0;
			}
		}
		for (int i = 0; i < unionSet.length; i++) {
			if(unionSet[i] != 0) {
				k = k+1; 
			}
		}
		int unionSet1[] = new int[k];
		int c=0;
		for (int i = 0; i < unionSet.length; i++) {
			if(unionSet[i] != 0) {
				unionSet1[c] = unionSet[i];
				c++;
			}
		}
		return unionSet1;
	}

}
