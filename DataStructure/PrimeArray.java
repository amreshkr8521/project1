package com.bridgelabz.DataStructure;

public class PrimeArray {
 static int array[][]=new int[26][10];
 static int number=2;
 static int insert1=0,insert2=0,insert3=0,insert4=0,insert5=0,insert6=0,insert7=0,insert8=0,insert9=0,insert10=0; 
 
	public static void prime() {
		//for(int i=0;i<26;i++) {
			//for(int j=0;j<10;j++) {
				//array[i][j]=0;
			//}
		
	//	}
		for(int count=0;count<1000;count++) {
			if(isPrime(number)) {
			linkedPrime(number);
			//System.out.print(number +" ");
			}
			
			number++;
		}
		
		
		
	}
	private static void linkedPrime(int number2) {
	int num=number2/100;
	//System.out.println(num);
		switch(num) {
		case 0 :	array[0][0]=0;
					array[insert1][0]=number2;
					insert1++;
					break;
		case 1:		array[0][1]=100;
					array[insert2][1]=number2;
					insert2++;
					break;
		case 2:		array[0][2]=200;
					array[insert3][2]=number2;
					insert3++;
					break;
		case 3:		array[0][3]=300;
				 	array[insert4][3]=number2;
				 	insert4++;
			break;
		case 4:		array[0][4]=400;
					array[insert5][4]=number2;
					insert5++;
			break;
		case 5:		array[0][5]=500;
					array[insert6][5]=number2;
					insert6++;
			break;
		case 6:		array[0][6]=600;
					array[insert7][6]=number2;
					insert7++;
			break;
		case 7:		array[0][7]=700;
					array[insert8][7]=number2;
					insert8++;
			break;
		case 8:		array[0][8]=800;
					array[insert9][8]=number2;
					insert9++;
			break;
		case 9:		array[0][9]=900;
					array[insert10][9]=number2;
					insert10++;
			break;
		
		
		}
		
	}
	/*****************   Prime Number   ***************************

	/*
	 * 
	 * to check the number is prime or not
	 * if number is not prime than it will return false and if prime than return true
	 * 
	 * @param		 arg --> integer
	 * @returnType	 boolean
	 */
		public static boolean isPrime(int arg) {
		// to traverse each number till half of the arg	
		for(int num=2;num<=arg/2;num++)
		
			if(arg%num==0)
				return false;
			
		
		return true;
	}
		public static void show() {
			prime();
			for(int i=0;i<26;i++) {
				for(int j=0;j<10;j++) {
					if(array[i][j]>0)
					System.out.print(array[i][j] +"      ");
				}
				System.out.println();
			}
		}
}
