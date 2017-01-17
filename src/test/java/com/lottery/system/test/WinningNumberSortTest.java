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
	
	@Test
	public void test_sorting_when_five_winning_number_are_generated()
	{
		
		Assert.assertArrayEquals(new int[]{5,34,38,44,58}, Rack.getNumbersDrawn(new int[]{58,5,44,38,34}));
	}
	
	@Test
	public void test_sorting_when_seven_winning_number_are_generated()
	{
		
		Assert.assertArrayEquals(new int[]{1,5,15,29,41,57,59}, Rack.getNumbersDrawn(new int[]{57,5,1,59,41,15,29}));
	}
	
	
	
}
