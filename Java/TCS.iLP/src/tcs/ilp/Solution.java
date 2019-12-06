package tcs.ilp;

class Solution{
		
	  public static int [] sortOddValues(int []Odd) {
		  for(int i=0;i<Odd.length-2;i=i+2){
			  System.out.println(i);
			  int temp=Odd[i+1];
			  Odd[i+1]=Odd[i];
			  Odd[i]=temp;
		  }
		return Odd;
	  }
	  public static void main(String args[]){
	    int Arr[] ={111,77,88,44,32,11,13,25,44};
	    int arr[]= new int[Arr.length];
	    arr=sortOddValues(Arr);
	    for(int i=0;i<arr.length;i++){
	      System.out.println(arr[i]);
	  }
	  }
	  
	}
