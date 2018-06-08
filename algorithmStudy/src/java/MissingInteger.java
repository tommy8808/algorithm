package java;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		
		//�迭�� ����߿� ���Ե��� ���� ���� ���� ��� ã��
		
		int[] array={1,-1,-2,4,5,7,9,2};
		
		System.out.println(solution(array));
		
	}

	public static int solution(int[] A) {
		
		Set<Integer> hashSet = new HashSet<>();
		for(int a : A) hashSet.add(a);
		
		for(int i = 1; i < Integer.MAX_VALUE; i++){
			if(!hashSet.contains(i)) return i;
		}
		
		return -1;
    }
}
