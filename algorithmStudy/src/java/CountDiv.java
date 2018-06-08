package java;

public class CountDiv {

	public static void main(String[] args) {

		System.out.println((solution(6	,11,2)));
	}

	
	public static int solution(int A, int B, int K) {
		//A 와 B 사이에 수 중 K 로 나누어 떨어지는 수 찾기 (0을 포함)
		//시간복잡도 n(1)
		
		double a = A;
	    double b = B;
	    System.out.println((b/K)+"-"+((a - 1)/K));
	    int ret =  (int) (Math.floor(b/K) - Math.floor((a - 1)/K)); 
	    
	    return  ret;

	}
	
}
