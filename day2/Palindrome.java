package week3.day2;

public class Palindrome {
public static void main(String[] args) {
	String str1="Madam";
	String rev="";
	for (int i = str1.length()-1; i >=0 ; i--) {
		rev=rev+str1.charAt(i);
	}
	if (str1.equalsIgnoreCase(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
