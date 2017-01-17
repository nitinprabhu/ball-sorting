package com.lottery.system;

/**
 * @author nitinprabhu
 */
import com.lottery.number.sorting.impl.Sorter;

public class Rack
{

	public int[] getBalls(int inputArray[])
	{
		if (inputArray.length > 1)
		{
			Sorter.sortElements(inputArray);
		}

		return inputArray;

	}

}
