package com.lottery.system;

public class Rack {

	
	public static int[] getNumbersDrawn(int inputArray[]) {
		
	if(inputArray.length <=1)
	{
			return inputArray;
	}
	else
	{
		 for (int i = 0; i < inputArray.length; i++) {
		        for (int j = 1; j < (inputArray.length - i); j++) {

		            if (inputArray[j - 1] > inputArray[j]) {
		                int temp = inputArray[j - 1];
		                inputArray[j - 1] = inputArray[j];
		                inputArray[j] = temp;
		            }

		        }
		    }
		
	}
	
	return inputArray;
		
		
	}

}
