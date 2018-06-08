package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualSidesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,3,2,1,5};
		
		System.out.println(findEvenIndex(array));
	}

	public static int findEvenIndex(int[] arr) {
		int result = -1, leftSum = 0, rightSum = 0;
		List<Integer> arrayList = new ArrayList<>();
		for(int i : arr) {
			arrayList.add(i);
			rightSum += i;
		}
		rightSum = Arrays.stream(arr).sum() - arr[0];
		System.out.println(rightSum);
		for(int i = 0, size = arr.length; i < size; i++ ){
			if(i != 0) leftSum += arrayList.get(i-1);
			rightSum -= arrayList.get(i);

			if(leftSum == rightSum){
				result = i;
				break;
			} 
		}
		
		return result;
		
	}
	
	
}
