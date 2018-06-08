package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxCounters {

	public static void main(String[] args) {

		//A 배열의 요소를 하나씩 탐색하며 N개의 카운터 중 요소에 맞는 카운터를 증가시키는 문제
		// 1<=A[k}<N 이면 카운터를 1증가,
		// A[k] = N + 1 이면 모든 요소를 Max 값으로 설정.
		int[] A = {3,4,4,6,1,4,4};
		int[] result = solution(5, A);
		for(int a : result){
			System.out.println(a);
		}
	}

	/*public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        List<Integer> arrayList = new ArrayList<>();
        for(int j=0;j<N;j++){
        	arrayList.add(0);
        }
        for(int i = 0; i < A.length; i++){
        	if(A[i] >= 1 && A[i] <= N){
        		//counter[A[i]-1]++;
        		arrayList.set(A[i]-1, arrayList.get(A[i]-1)+1);
        	} else if(A[i] == N+1){
        		//OptionalInt tmpInt = Arrays.stream(counter).max();
        		//arrayList.sort((x,y)->(x<y) ? -1 : ((x == y) ? 0 : 1));
        		Collections.max(arrayList);
        		arrayList.replaceAll(x->Collections.max(arrayList));
        		//Arrays.fill(counter, tmpInt.getAsInt());
        	}
        }
        Integer[] te = arrayList.toArray(new Integer[N]);
        for(int i = 0; i< te.length; i++){
        	counter[i] = te[i].intValue();
        }
        
        return counter;
        
    }*/
	
	public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int tempMax = 0;
        int max = 0;
        
        for(int i = 0; i < A.length; i++){
        	if(1 <= A[i] && A[i] <= N){
        		if(counter[A[i]-1] < max){
        			counter[A[i]-1] = max+1;
        		} else{
        			++counter[A[i]-1];
        		}
        		
        		if(tempMax < counter[A[i]-1]){
        			tempMax = counter[A[i]-1];
        		}
        	} else if(A[i] == (N+1)){
        		max = tempMax;
        	}
        	
        }
        for(int q=0; q<N; q++){
        	if(counter[q] < max){
        		counter[q] = max;
        	}
        }
        
        return counter;
        		
    }
}
