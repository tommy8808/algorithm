package java;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		
		int[] A = {10,2,5,1,8,20};
		//int[] A = {1,1,2,3,5};

		//배열의 3요소가 삼각형을 이루는지 확인
		//p+q>r, p+r>q, p+r>q
		//* 배열이 정렬된 상태라면 p<q<r은 다음 조건을 항상만족한다.
		// p+r > q
		// q+r > p
		//따라서 p+q > r 인지만 확인하면 된다.
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
        long p = 0, q = 0, r = 0;
        Arrays.sort(A);
        for(int i=A.length-1; i>=0; i--){
        	r = A[i];
        	for(int j=i-1; j>=1;j--){
        		q = A[i-1];
        		p = A[j-1];
        		if(p+q <= r){
        			break;
        		} else if(p+r>q && q+r>p){
        			System.out.println("p="+p+", q="+q+", r="+r);
        			return 1;
        		}
        	}
        }
        
		return 0;
    }
}
