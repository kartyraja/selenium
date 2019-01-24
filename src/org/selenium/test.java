package org.selenium;

import java.util.Scanner;

public class test {
	 
	public void karty() {
		
		String str = "##KKaa112";
	int upper=0,lower=0,num=0,spe=0;
	
	for (int i = 0; i < str.length(); i++) {
		
		char c = str.charAt(i);
		if (c>='A' && c<='Z') 
			upper++;					
		else if(c>='a' && c<='z')
			lower++;
		else if(c>='0' && c<='9')
			num++;
		else
			spe++;

		
	}
		
	System.out.println("lower"+lower+"upper"+upper+"number"+num+"special"+spe);
	}
		public static void main(String[] args) {
			
			test t=new test();
			t.karty();
		}
	
		
		
		
	
	  
}