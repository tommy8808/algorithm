package java;

public class GenomicRangeQuery {

	public static void main(String[] args) {

		//A,C,G,T=1,2,3,4
		//P[K] <= N < Q[K] 인 N 부분에서 최소값을 구하라
		//풀이 - 각 구간별 A,C,G 의 개수를 구하고
		// 만약 0부터 P[K]-1 까지의 A,C,G 갯수보다 0부터 Q[K]까지의 A,C,G 갯수가 더 많다면 최소값을 찾을 수있다.
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		String S = "CAGCCTA";
		int[] answer = solution(S, P, Q);
		for(int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(String S, int[] P, int[] Q) {

		int[] array = new int[P.length];
		
		int[] A = new int[S.length()];
		int[] C = new int[S.length()];
		int[] G = new int[S.length()];
		
		if(S.charAt(0) == 'A'){
			A[0]++;
		} else if(S.charAt(0) == 'C'){
			C[0]++;
		} else if(S.charAt(0) == 'G'){
			G[0]++;
		} 
		for(int i=1;i<S.length();i++){
			if(S.charAt(i)=='A'){
				A[i] = A[i-1] + 1;
				C[i] = C[i-1];
				G[i] = G[i-1];
			} else if(S.charAt(i)=='C'){
				A[i] = A[i-1];
				C[i] = C[i-1] + 1;
				G[i] = G[i-1];
			} else if(S.charAt(i)=='G'){
				A[i] = A[i-1];
				C[i] = C[i-1];
				G[i] = G[i-1] + 1;
			} else {
				A[i] = A[i-1];
				C[i] = C[i-1];
				G[i] = G[i-1];
			}
		}
		
		for(int j=0; j<P.length; j++){
			if(P[j]>0){
				if(A[Q[j]] > A[P[j]-1]){
					array[j] = 1;
				} else if(C[Q[j]] > C[P[j]-1]){
					array[j] = 2;
				} else if(G[Q[j]] > G[P[j]-1]){
					array[j] = 3;
				} else {
					array[j] = 4;
				}
			} else{
				if(A[Q[j]] > 0){
					array[j] = 1;
				} else if(C[Q[j]] > 0){
					array[j] = 2;
				} else if(G[Q[j]] > 0){
					array[j] = 3;
				} else{
					array[j] = 4;
				}
			}
			
		}
		
		return array;
    }
}
