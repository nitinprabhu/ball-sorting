package com.lottery.number.sorting.impl;

/**
 * @author nitinprabhu
 */
public class Sorter
{

	public static int[] sortElements(int inputArray[])
	{

		// This method uses bubble sort in ascending order
		for (int i = 0; i < inputArray.length; i++)
		{
			for (int j = 1; j < (inputArray.length - i); j++)
			{

				if (inputArray[j - 1] > inputArray[j])
				{
					int temp = inputArray[j - 1];
					inputArray[j - 1] = inputArray[j];
					inputArray[j] = temp;
				}

			}
		}

		return inputArray;
	}

}
