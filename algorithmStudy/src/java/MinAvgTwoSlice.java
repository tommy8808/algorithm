package java;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		
		//배열의 부분집합의 최소평균구하기
		//배열이 짝수일때는 2개의 원소의 평균이 최소값이 하나이상존재한다
		//배열이 홀수일때는 2개의 원소의 평균과 3개로된 하나의 원소 평균중
		//최소값이 존재한다나 뭐라나
		//따라서 3개나 두개의 평균만 구하고 넘어가면된다.
		//int[] A = {4,2,2,5,1,5,8};
		//int[] A = {-3, -5, -8, -4, -10};
		int[] A = {5, 6, 3, 4, 9};
		
		System.out.println(solution(A));
		
	}

	public static int solution(int[] A) {
		
		double minAvg = (A[0] + A[1]) / 2.0;
	    int minStartIndex = 0;
	 
	    for (int i = 2; i < A.length; i++) {
	        double avg = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
	 
	        if (avg < minAvg) {
	            minAvg = avg;
	            minStartIndex = i - 2;
	        }
	 
	        avg = (A[i - 1] + A[i]) / 2.0;
	 
	        if (avg < minAvg) {
	            minAvg = avg;
	            minStartIndex = i - 1;
	        }
	    }
	    return minStartIndex;
    }
}
