package java;

public class TapeEquilibrium {

	public static void main(String[] args) {

		int[] a = {};
		System.out.println(solution(a));
	}

	public static int solution(int[] A) {
		/*int oldNum = -999, newNum = 0;
		int p = 1, sumA = 0, sumB = 0;
		if(A.length == 0){
			return 0;
		}
		int i = 0;
		
		do{
			if(i<p){
				sumA += A[i];
			}else{
				sumB += A[i];
			}
			
			if(i == A.length-1)	{
				if(oldNum == -999 ){
					oldNum = Math.abs(sumA-sumB);
				} else{
					newNum = Math.abs(sumA-sumB);
					if(newNum<oldNum){
						oldNum = newNum;
					}
				}
				p++;
				i = -1;
				sumA = 0;
				sumB = 0;
			}
			i++;
			
		}while(p<A.length);
		
		return oldNum;*/
		
		
		int len = A.length;
        int[] sum = new int[len];
        // ���� �׷� ù��° sum
        sum[0] = A[0];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i-1] + A[i];
        }
        // ù��° sum�� ��
        int min = Math.abs(sum[len-1] - 2 * sum[0]);
        for (int i = 2; i < len; i++) {
            int temp = Math.abs(sum[len-1] - 2 * sum[i-1]);
            if(temp < min) min = temp;
        }
        return min;
    }
}
