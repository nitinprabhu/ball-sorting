package com.lottery.system;

public class Rack {

	
	public static int[] getNumbersDrawn(int inputArray[]) {
		
	if(inputArray.length <=1){
			return inputArray;
		}
		else
		{
		 if(inputArray[0] > inputArray[1]) 
		 {
				int temp=inputArray[0];
				inputArray[0]=inputArray[1];
				inputArray[1]=temp;
			}
			
		}
		 return inputArray;
		
		
	}

}
