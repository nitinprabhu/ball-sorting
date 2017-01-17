package com.lottery.system.test;

import org.junit.Assert;
import org.junit.Test;

import com.lottery.system.Rack;

public class WinningNumberSortTest {
	
	@Test
	public void test_sorting_when_no_winning_number_is_generated()
	{
		Rack rack=new Rack();
		
		Assert.assertArrayEquals(new int[]{}, rack.getNumbersDrawn(new int[]{}));
	}
}
