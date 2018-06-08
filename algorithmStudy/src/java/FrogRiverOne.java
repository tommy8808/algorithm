package java;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {

		int[] array = {1,3,1,4,2,3,5,4};
		//int[] array = {2,2,2,2,2};
		System.out.println(solution(5, array));
	}

	public static int solution(int X, int[] A) {

		int num = -1;
		Set<Integer> hashSet = new HashSet<>();
		
		for(int i = 0, size = A.length; i < size; i++){
			if(A[i] <= X){
				hashSet.add(A[i]);
				if(hashSet.size() == X){
					num = i;
					break;
				}
			}
		}
		
		return num;
    }
}
