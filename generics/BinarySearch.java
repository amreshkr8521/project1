package com.bridgelabz.generics;

public class BinarySearch {
	public static <T extends Comparable<T>> int binarySearch(T param[],T searched, int lastIndex,int firstIndex){
		if(lastIndex >=firstIndex)														
		{
			int middle=firstIndex +(lastIndex-firstIndex)/2; 							
			if(param[middle]==searched)											 
			{
				return middle; 															 
			}
			else if(searched.compareTo(param[middle])>0) 										
			{
				binarySearch(param, searched, lastIndex, middle);			
			}
			else if(searched.compareTo(param[middle])<0)											
			{
				binarySearch(param, searched, middle, firstIndex);			
			}
		}
		return -1;																		 
		}
	public static void main(String[] args) {
		String names[]= {"amresh","vishal","bikash","durga"};
		System.out.println(binarySearch(names, "amresh",4 ,0));
		//int array[]= {56,41,21,12,6};
		//System.out.println(binarySearch(array,12, 4, 0));
	}
	}


