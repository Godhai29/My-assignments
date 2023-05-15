package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text= "We learn java basics as part of java sessions in java week";
		String dup="";
		String[] split = text.split(" ");
		Set<String> str= new LinkedHashSet<String>();
		for (int i = 0; i <split.length; i++) {
			if (str.add(split[i])) {
				dup=dup+split[i];
				System.out.println(split[i]);
			} else {
System.out.println("");
			}
		}
	}
}
