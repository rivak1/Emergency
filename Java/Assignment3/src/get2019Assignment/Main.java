package get2019Assignment;
import java.util.*;
public class Main {
	public static void main(String[] args){
		
		int arrivalTimeAndBrustTime;	
		
		Scanner userInput = new Scanner(System.in);
		
		JobScheduler JobSchedularObj = new JobScheduler();
		int flag=0;
		int sizeOfArrivaTime = 0;
		int sizeOfBurstTime = 2;
		System.out.println("Insert Size Of Job Shedular");
		sizeOfArrivaTime=0;
		while(sizeOfArrivaTime<=0){
			sizeOfArrivaTime=userInput.nextInt();
			System.out.println("Enter Your Job Shedular Greater then >0");
		}
		
		int JobSchedulingTable [][] = new int[sizeOfArrivaTime][sizeOfBurstTime];
		
		
		for(int i=0;i<sizeOfArrivaTime;i++){
			for(int j=0;j<sizeOfBurstTime;j++){
				
				if(flag==0){
					System.out.println("Insert Arrival Time ");	
					flag=1;
				}else {
					System.out.println("Insert Brust Time ");	
					flag=0;
				}
				
				arrivalTimeAndBrustTime = userInput.nextInt();
				
				JobSchedulingTable[i][j]=arrivalTimeAndBrustTime;
			}
		}
		
		for(int i=0;i<JobSchedulingTable.length-1;i++){
			for(int j=i+1;j<JobSchedulingTable.length;j++){
				if(JobSchedulingTable[i][0]>JobSchedulingTable[j][0]){
					int temp=JobSchedulingTable[i][0];
					JobSchedulingTable[i][0]=JobSchedulingTable[j][0];
					JobSchedulingTable[j][0]=temp;
					
					int temp1=JobSchedulingTable[i][1];
					JobSchedulingTable[i][1]=JobSchedulingTable[j][1];
					JobSchedulingTable[j][1]=temp1;
				}
			}
		}

		
	int completeTimeOfEachProcess[]=JobSchedularObj.getCompletionTimeOfEachProcess(JobSchedulingTable);
	for(int i=0;i<completeTimeOfEachProcess.length;i++){
		System.out.println("P"+i+" Complete Time->"+completeTimeOfEachProcess[i]);
	}
	
	int turnAroundTimeOfEachProcess[]=JobSchedularObj.getturnAroundTimeOfEachProcess(JobSchedulingTable , completeTimeOfEachProcess);
	for(int i=0;i<turnAroundTimeOfEachProcess.length;i++){
		System.out.println("P"+i+" TurnAround Time->"+turnAroundTimeOfEachProcess[i]);
	}
	
	int watingTimeOfEachProcess[]=JobSchedularObj.getWatingTimeOfEachProcess(JobSchedulingTable , turnAroundTimeOfEachProcess);
	for(int i=0;i<watingTimeOfEachProcess.length;i++){
		System.out.println("P"+i+" TurnAround Time->"+watingTimeOfEachProcess[i]);
	}

	double avgAverageWatingTimeOfProcess=JobSchedularObj.getAverageWatingTimeOfProcess(watingTimeOfEachProcess);
	System.out.println("Average Wating Time->"+avgAverageWatingTimeOfProcess);
	
	int maxWatingTimeOfProcess=JobSchedularObj.getMaxWatingTimeOfProcess(watingTimeOfEachProcess);
	System.out.println("Maximum Wating Time->"+maxWatingTimeOfProcess);
	}
}
