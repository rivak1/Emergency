package tcs.ilp;

import java.util.Scanner;

public class Sol {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n;
        int i,j,r,val,l=0;
        Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
            int a[] = new int[n];
            int a1[] = new int[n];
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
         	//System.out.println(a[i]);
            for(j=2;j<=a[i];j++)
            {
            	if(a[i]%j==0) 
            	{
            		
            		break;
            	}
            }
            if(a[i]==j){
        	 	val=a[i];
        		int sum=0;
        		while(a[i]>0) {
        			r=a[i]%10;
        			sum=sum*10+r;
        			a[i]=a[i]/10;
        		}

        	 	System.out.println("s"+sum);
        		if(sum==val) {
        			
        		a1[l]=sum;	
        		l=l+1;
        		}

               	}

        }
        for(i=1;i<l;i++) {
        	int key=a1[i];
        	j=i-1;
        	while(j>=0&&a1[j]>key) {
        		a1[j+1]=a1[j];
        		j=j-1;
        	}
        	a1[j+1]=key;
        }
        for(i=0;i<l;i++) {
    		System.out.println(a1[i]);
    		
    	}
    }
}