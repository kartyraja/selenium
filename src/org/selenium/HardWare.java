package org.selenium;

public class HardWare {

	public void karty() {
		// TODO Auto-generated constructor stub
		
		int c=0;
		for (int i = 1; i < 10; i++) {
			if(i%2==0)
				c=c+1;
				
		}System.out.println(c);
	}
	
	public static void main(String[] args) {
		HardWare h=new HardWare();
		h.karty();
	}
}
