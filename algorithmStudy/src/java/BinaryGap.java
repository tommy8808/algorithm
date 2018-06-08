package java;

public class BinaryGap {

	public static void main(String[] args) {
		
		System.out.println(solution(1376796946));

	}

	public static int solution(int N) {
		int gap = 0;
		boolean isStart = false;
		
		String tmp = Integer.toBinaryString(N);
		System.out.println(tmp);
		int tmpCnt = 0;
		for(int i = 0, size = tmp.length(); i < size; i++){
			if(tmp.charAt(i) == '1'){
				isStart = true;
				if (tmpCnt > gap) {
					gap = tmpCnt;
				}
				tmpCnt = 0;
			}
			if(isStart && tmp.charAt(i) == '0'){
				tmpCnt++;
			}
		}
		
        return gap;
    }
}
