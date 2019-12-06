package get2019Assignment;

public class JobScheduler{

	public int[] getCompletionTimeOfEachProcess(int[][] jobSchedulingTable){
		int sizeOfCompletionTime=jobSchedulingTable.length;
		int firstJobArrivalTime=jobSchedulingTable[0][0];
		System.out.println("First"+firstJobArrivalTime);
		int completionTimeOfEachProcess[] = new int[sizeOfCompletionTime];
		
		for(int i=0;i<sizeOfCompletionTime;i++){
			for(int j=0;j<2;j++){
				if(j==1){
					if(i==0){
						completionTimeOfEachProcess[i]=firstJobArrivalTime+jobSchedulingTable[i][j];
						firstJobArrivalTime=firstJobArrivalTime+jobSchedulingTable[i][j];
					}else{
						
						if(completionTimeOfEachProcess[i-1]>jobSchedulingTable[i][j-1]){
							completionTimeOfEachProcess[i]=firstJobArrivalTime+jobSchedulingTable[i][j];
							firstJobArrivalTime=firstJobArrivalTime+jobSchedulingTable[i][j];
						}else{
							completionTimeOfEachProcess[i]=(jobSchedulingTable[i][j-1]-completionTimeOfEachProcess[i-1])+firstJobArrivalTime+jobSchedulingTable[i][j];
							firstJobArrivalTime=(jobSchedulingTable[i][j-1]-completionTimeOfEachProcess[i-1])+firstJobArrivalTime+jobSchedulingTable[i][j];
						}
					}
				}
			}
		}
				
		return completionTimeOfEachProcess;
	}

	public int[] getturnAroundTimeOfEachProcess(int[][] jobSchedulingTable , int[] completeTimeOfEachProcess){
		
		int turnAroundTimeOfEachProcess[]= new int[jobSchedulingTable.length];
		
		int sizeOfturnAroundTime=jobSchedulingTable.length;
		System.out.println();
		for(int i=0;i<sizeOfturnAroundTime;i++){
			
			for(int j=0;j<2;j++){
				
				if(j==0){
					
					turnAroundTimeOfEachProcess[i]=completeTimeOfEachProcess[i]-jobSchedulingTable[i][j];
					
				}
			}
		}
		
		return turnAroundTimeOfEachProcess;
	}
	
	public int[] getWatingTimeOfEachProcess(int[][] jobSchedulingTable , int[] turnAroundTimeOfEachProcess){
		
		int watingTimeOfEachProcess[]= new int[jobSchedulingTable.length];
		
		int sizeOfWatingTime=jobSchedulingTable.length;
		System.out.println();
		for(int i=0;i<sizeOfWatingTime;i++){
			
			for(int j=0;j<2;j++){
				
				if(j==1){
					
					watingTimeOfEachProcess[i]=turnAroundTimeOfEachProcess[i]-jobSchedulingTable[i][j];
					//System.out.print(i+"-"+(turnAroundTimeOfEachProcess[i]-jobSchedulingTable[i][j]));
					
				}
			}
		}
		
		return watingTimeOfEachProcess;
	}

	public double getAverageWatingTimeOfProcess(int[] watingTimeOfEachProcess) {
		double averageWatingTime=0;
		for(int i=0;i<watingTimeOfEachProcess.length;i++){
			
			averageWatingTime=averageWatingTime+watingTimeOfEachProcess[i];
		}
		
		return averageWatingTime/watingTimeOfEachProcess.length;
	}
	
	public int getMaxWatingTimeOfProcess(int[] watingTimeOfEachProcess){
		
		int maxWatingTime=watingTimeOfEachProcess[0];
		
		for(int i=0;i<watingTimeOfEachProcess.length;i++){
			
			if(maxWatingTime<watingTimeOfEachProcess[i]){
				
				maxWatingTime=watingTimeOfEachProcess[i];
			}
		}
		
		return maxWatingTime;
	}
	
}
