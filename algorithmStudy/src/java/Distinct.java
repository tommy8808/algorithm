package java;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,2,2,3,1,1};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
        
		Set<Integer> hashSet = new HashSet<>();
		
		for(int i=0; i<A.length; i++){
			hashSet.add(A[i]);
		}
		
		return hashSet.size();
    }
}
