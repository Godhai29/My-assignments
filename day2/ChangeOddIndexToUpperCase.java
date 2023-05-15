package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	String test = "changeme";
	char[] charArray1 = test.toCharArray();
	for (int i = 0; i < charArray1.length; i++) {
		if (i%2!=0) {
		charArray1[i] = Character.toUpperCase(charArray1[i]);
		}
		System.out.print(charArray1[i]);
	}
	}
}
