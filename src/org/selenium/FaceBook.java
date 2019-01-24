package org.selenium;

import java.util.Iterator;

public class FaceBook {
	
public static void main(String[] args) {
	
	String s="karty is the boy";
	System.out.println(s);
	char ch=s.charAt(3);
	System.out.println(ch);
	boolean b = s.equals("kartY");
	System.out.println(b);
	boolean b1 = s.equalsIgnoreCase("KARty");
	System.out.println(b1);
	boolean c = s.contains("u");
	System.out.println(c);
	String[] sp = s.split("i");
	System.out.println(sp.length);
	for(String x: sp) {
		
	System.out.println(x);
	}
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String l = s.toLowerCase();
	System.out.println(l);
	
	String start = s.substring(6,8);
	System.out.println(start);
	
	int i = s.indexOf("y");
	System.out.println(i);
	
	int j= s.lastIndexOf("y");
	System.out.println(j);
	
	String replace = s.replace("boy", "guys");
	System.out.println(replace);
	boolean d = s.isEmpty();
	System.out.println(d);
	
	boolean startsWith = s.startsWith("karty");
	System.out.println(startsWith);
	
	boolean startsWith1 = s.endsWith("boys");
	System.out.println(startsWith1);
	
	int i1='%';
	System.out.println(i1); 
	
	
	String S1="karty";
	String s2="raja";
	System.out.println("Immutable");
	System.out.println(System.identityHashCode(S1));
	System.out.println(System.identityHashCode(s2));
	String r = s.concat(s2);
	System.out.println(System.identityHashCode(r));
	StringBuffer x1=new StringBuffer("karty");
	StringBuffer x2=new StringBuffer("raja");
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
	StringBuffer r1 = x1.append(x2);
	System.out.println(System.identityHashCode(r1));
	
	
	
	String c1="karty";
	String c2="kartY was ill";
for (int k = 0; k < c1.length(); k++) {
	char compare1 = c1.charAt(k);
	{for (int m = 0; m < c2.length(); m++) {
		char compare2 = c2.charAt(m);
	if (compare1==compare2) {
		System.out.println(c1.charAt(k));
	}//System.out.println(c1.charAt(k));
		
		
	}
	
}
	
}
for (int k = 0; k < 5; k++) {
	for (int k2 = 0; k2 < 5; k2++) {
		String substring = c1.substring(k,k2);
		System.out.println(substring);
		
	}
} {
	
}
String first = c1.substring(0, 1).toUpperCase();
String last = c1.substring(2,3).toUpperCase();
String middle = c1.substring(1,c1.length()-1);




	
	
}}