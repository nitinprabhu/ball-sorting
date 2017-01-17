package com.lottery.system.test;

import org.junit.Assert;
import org.junit.Test;

import com.lottery.system.Rack;

public class WinningNumberSortTest {
	
	@Test
	public void test_sorting_when_no_winning_number_is_generated()
	{
		Assert.assertArrayEquals(new int[]{}, Rack.getNumbersDrawn(new int[]{}));
	}
	
	@Test
	public void test_sorting_when_one_winning_number_is_generated()
	{
		Assert.assertArrayEquals(new int[]{20}, Rack.getNumbersDrawn(new int[]{20}));
	}
	
	@Test
	public void test_sorting_when_two_winning_number_are_generated()
	{
		
		Assert.assertArrayEquals(new int[]{20,30}, Rack.getNumbersDrawn(new int[]{30,20}));
	}
}
