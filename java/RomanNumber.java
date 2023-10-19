package assignment;
import java.util.*;
import java.io.*;
public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RomanNumber obj=new RomanNumber();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Roman number in capital letters:");
String inputRoman=sc.nextLine();
System.out.println("The integer value of given Roman number:"+obj.romanToInt(inputRoman));
}
int NumValue(char rom) {
	if(rom=='I')
		return 1;
	if(rom=='V')
		return 5;
	if(rom=='X')
		return 10;
	if(rom=='L')
		return 50;
	if(rom=='C')
		return 100;
	if(rom=='D')
		return 500;
	if(rom=='M')
		return 1000;
	return -1;
	
}
int romanToInt(String str) {
	int sum=0;
	for(int i=0;i<str.length();i++) {
		int s1=NumValue(str.charAt(i));
		if(i+1<str.length()) {
			int s2=NumValue(str.charAt(i+1));
			if(s1>=s2) {
				sum=sum+s1;
			}
			else {
				sum=sum-s1;
			}
		}
		else {
			sum=sum+s1;
		}
	}
	return sum;
}
}
