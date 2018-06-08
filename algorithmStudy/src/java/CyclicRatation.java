package java;

import java.util.Arrays;

public class CyclicRatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {4, 6, 0, 0, -2, 10};
		test = solution(test, 6);
		System.out.println(Arrays.toString(test));
	}

	
	public static int[] solution(int[] A, int K) {
		int[] tmpArray = A;
		int[] array = new int[A.length];
		if(A.length > 0 && K > 0){
			for(int i = 0; i < K; i++){
				int tmp = tmpArray[A.length - 1];
				for(int j = 1; j < A.length ; j++){
					array[j] = tmpArray[j-1];
				}
				array[0] = tmp;
				tmpArray = array.clone();//�����͸� ���ϱ� ���� ���
			}
		}
		
        return tmpArray;
    }
}

