package week3.day2;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if (text1.length()==text2.length()) {
	    System.out.println("Length of text1:"+text1.length());
	    System.out.println("Length of text2:"+text2.length());
		}
		 char[] charArray = text1.toCharArray();	
	     char[] charArray2 = text2.toCharArray();
	     Arrays.sort(charArray);
	     Arrays.sort(charArray2);
	     if (Arrays.equals(charArray, charArray2)) {
			System.out.println("Has same value");	
		} 
	     else {
			System.out.println("Has different value");
		}
	}
}
