package gate2019.assignment4;

public class ArrayOperation {

	public void maxMirror(int inputArray[]){
		int value;
		int index;
		int returnval;
		int check[] = new int[inputArray.length];
		
		for(int i=inputArray.length-1; i>0; i--){
			value=inputArray[inputArray.length-1-i];
			int counter=1;
			index=(inputArray.length-1)-i;
			returnval=(inputArray.length);
			while(returnval!=-1){		
				int result=1;
				counter=1;
				returnval=linearSearch(value,index,returnval-1,inputArray);		
				if(returnval != -1){					
					for(int j=returnval; j>=index; j--){
						if((returnval-counter) != -1 && (index+counter)<inputArray.length) {
						 if(inputArray[index+counter] == inputArray[returnval-counter]){
								result=result+1;
								counter=counter+1;
							}else{
								check[index] = result;
								//System.out.println("Result"+result);
								result=0;
								break;
							}
						}
						else{
							check[index] = result;
							//System.out.println("Result"+result);
							result=0;
							break;
						}
					}
				}
				
			}
			
		}
		int max=check[0];
		for(int i=0; i<check.length;i++) {
			if(max<check[i]){
				max=check[i];
			}
		}
		System.out.println("Your section is=>"+max);
	}
	
	
	private int linearSearch(int value ,int index, int i, int[] inputArray) {
		for(int  lopp=i; lopp>index; lopp--){
			if(inputArray[lopp] == value){
				return lopp;
			}
		}
		return -1;
	}


	public void countClumps(int[] a) {
		int count=0;
		int index=-1;
		for(int i=1;i<=a.length-1;i++){
				if(a[i-1]==a[i]){
					if(index == a[i]){
						index=a[i-1];
						continue;
					}
					else 
					{
						count=count+1;
						index=a[i-1];
					}					
				}
				else{
					index=a[i-1];
				}
			}
		}


	public void splitArray(int[] a4) {
		int sum=0;
		int r=0;
		int k=0;
		for(int i=0;i<a4.length;i++) {
			sum=sum+a4[i];
		}
		if(sum%2==1) {
			System.out.println(-1);
		}else{
			int z=(sum/2);
			while(z!=r &&sum>0){
				r=sum-a4[k];
				sum=sum-a4[k];
				k=k+1;
			}
			if(k==a4.length) {
				System.out.println(-1);
			}else {
				System.out.println(k);
			}
		}
	}


	public void fixXY(int[] a5, int x, int y) {
		//1, 4, 1, 5, 5, 4, 
		int i=0;
		
		int[] ArrayOfY = new int [a5.length];
		
		for(int j = 0; j<a5.length; j++){
		
			if(a5[j] == y){
				ArrayOfY[i] = j;
				i=i+1;
			}
			else{
				ArrayOfY[i] = -1;
				i=i+1;
			}
			
		}
		int i1=0;
		for(i1 = 0; i1<a5.length; i1++){
			if(a5[i1] == x){
				System.out.println(i1+"j");
				if(i1<a5.length-1){
					for(int k=0;k<ArrayOfY.length;k++) {
						System.out.println(k+"kk");
						if(ArrayOfY[k]!=-1) {
							int temp = a5[i1+1];
							a5[i1+1]=a5[ArrayOfY[k]];
							a5[ArrayOfY[k]]=temp;
							ArrayOfY[k]=-1;
							break;
						}
	
					}
				}
			}
			
		}
		
		for(int f=0; f<a5.length; f++) {
			System.out.println(a5[f]);
		}
		for(int f=0; f<a5.length; f++) {
			System.out.println(ArrayOfY[f]);
		}
	}
	
	
	
	
}
