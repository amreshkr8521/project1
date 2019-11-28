package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.Calender;

class CalenderTest {

	Calender test=new Calender();
	@Test
	public void Test_for_Day_Of_Week_When_Month_Is_11_Day_Is_28_Year_Is_2109_Returns_5() {
	int day=28;
	int month=11;
	int year=2019;
	
	assertEquals(4,test.day(month, day, year));
	}
	
	
	@Test
	public void Test_for_Day_Of_Week_When_Month_Is_11_Day_Is_27_Year_Is_2109_Returns_5() {
	int day=27;
	int month=11;
	int year=2019;
	
	assertEquals(3,test.day(month, day, year));
	}
	
	@Test
	public void Test_for_Day_Of_Week_When_Month_Is_11_Day_Is_25_Year_Is_2109_Returns_5() {
	int day=25;
	int month=11;
	int year=2019;
	
	assertEquals(1,test.day(month, day, year));
	}

	
	@Test
	public void Test_for_Day_Of_Week_When_Month_Is_10_Day_Is_28_Year_Is_2109_Returns_5() {
	int day=28;
	int month=10;
	int year=2019;
	
	assertEquals(1,test.day(month, day, year));
	}
	
	
	@Test
	public void Testing_For_Leap_Year_When_Year_Is_2019() {
		int year=2019;
		assertEquals(false,test.isLeapYear(year));
	}
	
	@Test
	public void Testing_For_Leap_Year_When_Year_Is_2018() {
		int year=2018;
		assertEquals(false,test.isLeapYear(year));
	}
	
	@Test
	public void Testing_For_Leap_Year_When_Year_Is_2016() {
		int year=2016;
		assertEquals(true,test.isLeapYear(year));
	}
}
