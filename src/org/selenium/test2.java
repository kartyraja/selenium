package org.selenium;


//import newpack2.newClass1;

public class test2{
public static void main(String[] args) {
	

	int num=1251,result=0;
	int f=num;
	int digit = 0;
	
	while (num!=0) {     //
		 digit=num%10;  //1 7 3
		result=result*10+digit; //1	17  173
		
		num/=10; //37  3
		
	}
		
	
		if(result==f)
			{System.out.println("palindrome");
			}
		else
			System.out.println("no");
		System.out.println(result);
	}
}
