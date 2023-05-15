package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		int arr1[]= {1,2,8,4,9,7};
		List<Integer> arrList1=new ArrayList<Integer>();
		List<Integer> arrList2=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i]==arr1[j]) {
					arrList1.add(arr[i]);
					arrList2.add(arr[j]);
				}
			}
		}
	System.out.println(arrList1);
	}
}
