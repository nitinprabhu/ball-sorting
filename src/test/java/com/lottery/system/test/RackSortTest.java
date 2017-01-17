package com.lottery.system.test;

/**
 * @author nitinprabhu
 */
import org.junit.Assert;
import org.junit.Test;

import com.lottery.system.Rack;

public class RackSortTest
{

	@Test
	public void test_sorting_when_no_winning_number_is_generated()
	{
		Rack rack = new Rack();
		Assert.assertArrayEquals(new int[] {}, rack.getBalls(new int[] {}));
	}

	@Test
	public void test_sorting_when_one_winning_number_is_generated()
	{
		Rack rack = new Rack();
		Assert.assertArrayEquals(new int[] { 20}, rack.getBalls(new int[] { 20}));
	}

	@Test
	public void test_sorting_when_two_winning_number_are_generated()
	{
		Rack rack = new Rack();
		Assert.assertArrayEquals(new int[] { 20, 30}, rack.getBalls(new int[] { 30, 20}));
	}

	@Test
	public void test_sorting_when_five_winning_number_are_generated()
	{
		Rack rack = new Rack();
		Assert.assertArrayEquals(new int[] { 5, 34, 38, 44, 58}, rack.getBalls(new int[] { 58, 5, 44, 38, 34}));
	}

	@Test
	public void test_sorting_when_seven_winning_number_are_generated()
	{
		Rack rack = new Rack();
		Assert.assertArrayEquals(new int[] {
										1,
										5,
										15,
										29,
										41,
										57,
										59}, rack.getBalls(new int[] { 57, 5, 1, 59, 41, 15, 29}));
	}

}
