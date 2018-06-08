package java;

public class PassingCars {

	public static void main(String[] args) {
		
		//0은 오른쪽으로 가고 1은 서쪽으로 가는 차다.
		//오른쪽으로 가는차가(1) 왼쪽으로 오는차(1)를 만날 경우의 수
		//1의 입장에서 앞으로 만날수 있는 0의 개수를 세며 계산
		int[] A = {0,1,0,1,1};
		System.out.println(solution(A));
		

	}

	public static int solution(int[] A) {
		int zero = 0;
		int sum = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] == 1){
				sum += zero;
				if(sum > 1000000000) return -1;
			} else{
				zero++;
			}
		}
		return sum;
    }
}
