package java;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {

		int[] A = {};
		System.out.println(solution(A));
	}

	
	public static int solution(int[] A) {
        
        if(A == null || A.length == 0) return 1;
        
        int num = 1, length = A.length;
        Arrays.sort(A);
        if(A[length-1] != length + 1){
        	num = length + 1;
        } else if(A[0] != 1){
        	num = 1;
        } else{
        	for(int i = 1; i < A.length; i++){
            	if(A[i-1] +1 != A[i]) {
            		num = A[i-1]+1;
            	}
            }
        }
        
        return num;
        //�ٸ���� ������ Ǯ��- 1���� n+1����ŭ arraylist�� �ְ� A�� �ִ°� ����
        //�ð����⵵�� ������
        /*ArrayList<String> tempList = new ArrayList<>();
        for(int number = 1; number <= length+1; number++) tempList.add(Integer.toString(number));
        for(int index = 0; index < length; index++) tempList.remove(Integer.toString(A[index]));
        return Integer.parseInt(tempList.get(0));*/
    }
}
