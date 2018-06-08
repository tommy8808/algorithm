package java;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {

		int[] A = {4};
		System.out.println(solution(A));
		
	}

	public static int solution(int[] A) {

		Set<Integer> set = new HashSet<>();
		for(int a : A){
			set.add(a);
		}
		for(int i = 1; i<= A.length; i++){
			if(!set.contains(i)){
				return 0;
			}
		}
		
		return 1;
	}
}
