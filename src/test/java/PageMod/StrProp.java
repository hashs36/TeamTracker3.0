package PageMod;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StrProp {
//public	String s1,s2,s3;
public	static String s1="harish Kumar";
public static 	String s2="Anumasa";
	public static void main(String[] args) {
		

System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.concat(s2));
System.out.println(s1.charAt(3));
System.out.println(s1.indexOf('s'));
System.out.println(s1.indexOf("s"));
System.out.println(s1.indexOf('h'));
System.out.println(s1.indexOf('h'));
System.out.println(s1.split(""));
//System.out.println(s1.intern()+"validate");
System.out.println(s1.substring(5));
System.out.println(s1.substring(5,11));

indexofchar();
	}
//Print  the index position of given character in the  string 	
public static void indexofchar() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the char to find ");
String s3 = sc.next();
String[] strsplit = s1.split("");
ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strsplit));
int ipos=0;
for(String i :strList) {
	System.out.println(i);
	ipos = ipos+1;
	if (s3.equalsIgnoreCase(i)) {
		//ipos = ipos+s1.indexOf(i);
		System.out.println(ipos-1+" :::is the position of character in given string and character is  :::"+i);
	}
	
	
}}}


