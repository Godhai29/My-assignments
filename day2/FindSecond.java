package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecond {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		List<Integer> arrData=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			arrData.add(data[i]);
		}
		Collections.sort(arrData);
		System.out.println(arrData);
		Integer secLargest = arrData.get(arrData.size()-2);
		System.out.println(secLargest);
	}
}
