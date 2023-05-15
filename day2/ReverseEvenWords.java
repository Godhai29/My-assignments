package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
	String test="I am a software tester";
	String[] split = test.split(" ");
  for (int i = 0; i < split.length; i++) {
	if (1%2!=0) {
		String evenWords=split[i];
		String str="";
		for (int j = evenWords.length()-1; j >= 0; j--) {
			str=str+evenWords.charAt(j);
		}
		split[i]=str;
	}
}
  String join = String.join(" ", split);
  System.out.println(join);
}
}
