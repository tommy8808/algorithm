package java;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {

		//배열의 3요소를 곱해 나오는 가장 큰 수를 리턴하라
		//int[] A = {-3,1,2,-2,5,6};
		//정렬 후 맨 마지막이 음수면 : 맨 뒤에서 3개 곱
		//맨 뒤의 요소는 늘 곱해지므로 앞의 두개냐 뒤에서 두,세번째의 곱이냐를 비교하면된다.
		
		int[] A = {4, 7, 3, 2, 1, -3, -5};
		
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		
		Arrays.sort(A);
		
		/*int maxVal=A[A.length-1]*A[A.length-2]*A[A.length-3];//맨 뒤에 세개의 요소가 가장 큰수라 가정
		if(A[A.length-1]<0){
			return maxVal;
		} else if(A[A.length-2]<0||A[A.length-3]<0){
			return A[0]*A[1]*A[A.length-1];
		}
		
		System.out.println(maxVal);
		int tmpMaxVal=0;
		if(A[0] < 0 && A[1] < 0){//앞자리 두개가 음수면 양수가 나오므로 체크
			tmpMaxVal = A[0] * A[1];
			boolean isAllNegative = true;
		
			for(int i=A.length-1;i>1;i--){
				if(A[i] > 0){
					tmpMaxVal=tmpMaxVal*A[i];
					isAllNegative = false;
					break;
				}
			}
			if(isAllNegative) tmpMaxVal = tmpMaxVal*A[2];
			if(tmpMaxVal>maxVal){
				maxVal = tmpMaxVal;
			}
		}
		
		return maxVal;*/
		
		int p1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
	    int p2 = A[A.length - 1] * A[0] * A[1];
	 
	    return p1 > p2 ? p1 : p2;


    }
}
