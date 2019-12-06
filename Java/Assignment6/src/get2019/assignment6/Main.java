package get2019.assignment6;

public class Main {

	public static void main(String[] args) {
		
		int Array[] =  new int[]{1,2,3,4,5,6,7,8,9};
		final intSet obj = new intSet(5);
		System.out.println(obj.isMember(10,Array));
		System.out.println(obj.sizeOfSet(Array));
		System.out.println(obj.isSubSet(Array,new int[]{7,1,3}));
		int A[] = obj.getComplement(Array,new int[]{7,1,3});
		for (int i = 0; i < A.length; i++) {
			
			System.out.println(A[i]);
		}
		int Array1[] =  new int[]{1,2,3,4,5,6,7,8,9};
		int A1[] = obj.getUnion(Array1,new int[]{11,10,13,1,15,16});
		System.out.println(A1.length);
		for (int i = 0; i < A1.length; i++) {
			
			System.out.println(A1[i]);
		}
	}

}
