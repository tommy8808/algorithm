package java;

public class woowaTestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {6,1,4,6,3,2,7,4};
		//int[] A = {10,19,15};
		int K = 3;
		int L = 2;
		
		int result = solution(A, K, L);
		System.out.println(result);
	}

	public static int solution(int[] A, int K, int L) {
        
		int oldSum = -1;
		int newSum = 0;

        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i < A.length - K - L - 1 ; i++){
        	int t = 0;
        	for(int p = t; p < A.length - K- L- i + 1; p++){
        		sumA += A[K+p-1];
        		System.out.println("A:"+sumA);
        	}t++;
        	for(int j = K+t+L+1-i; j < A.length ; j++){//�䰳��
        		sumB += A[j];
        		System.out.println("B:"+sumB);
        	}
        	newSum = sumA + sumB;
        	if(newSum > oldSum ){
        		System.out.println("old:"+oldSum);
        		System.out.println("new:"+newSum);
        		oldSum = newSum;
        		
        	} 
        	sumA = 0;
    		sumB = 0;
        
        }
        
        return oldSum;
    }
	
	
	
	/*public static int solution(int A, int B, int C, int D) {
		int result = 0; 
		result = (int) Math.max(Math.pow(Math.abs(A - B),2) + Math.pow(Math.abs(C-D),2)
		, Math.pow(Math.abs(A - C),2) + Math.pow(Math.abs(B-D),2));
		return result;
    }*/
	
	
	/*public static int solution(String A, String B) {
		int result = 0; 
        // write your code in Java SE 8
		List<Integer> alecsDeck = new ArrayList<>();
		List<Integer> bobsDeck = new ArrayList<>();
		
		for(int i = 0, size = A.length(); i < size; i++ ){
			switch (A.charAt(i)) {
			case 'A' :
				alecsDeck.add(14);
				break;
			case 'K' :
				alecsDeck.add(13);
				break;
			case 'Q' :
				alecsDeck.add(12);
				break;
			case 'J' :
				alecsDeck.add(11);
				break;
			case 'T' :
				alecsDeck.add(10);
				break;
			case '9' :
				alecsDeck.add(9);
				break;
			case '8' :
				alecsDeck.add(8);
				break;
			case '7' :
				alecsDeck.add(7);
				break;
			case '6' :
				alecsDeck.add(6);
				break;
			case '5' :
				alecsDeck.add(5);
				break;
			case '4' :
				alecsDeck.add(4);
				break;
			case '3' :
				alecsDeck.add(3);
				break;
			case '2' :
				alecsDeck.add(2);
				break;
			case '1' :
				alecsDeck.add(1);
				break;		
			default : 
				break;
			}
			
			switch (B.charAt(i)) {
			case 'A' :
				bobsDeck.add(14);
				break;
			case 'K' :
				bobsDeck.add(13);
				break;
			case 'Q' :
				bobsDeck.add(12);
				break;
			case 'J' :
				bobsDeck.add(11);
				break;
			case 'T' :
				bobsDeck.add(10);
				break;
			case '9' :
				bobsDeck.add(9);
				break;
			case '8' :
				bobsDeck.add(8);
				break;
			case '7' :
				bobsDeck.add(7);
				break;
			case '6' :
				bobsDeck.add(6);
				break;
			case '5' :
				bobsDeck.add(5);
				break;
			case '4' :
				bobsDeck.add(4);
				break;
			case '3' :
				bobsDeck.add(3);
				break;
			case '2' :
				bobsDeck.add(2);
				break;
			case '1' :
				bobsDeck.add(1);
				break;
			default : 
				break;
			}
			
			if(alecsDeck.get(i) > bobsDeck.get(i)){
				result++;
			}
		}
		return result;
    }
	*/
	
	
	
	
	
  /*  public static int solution(String S) {
        // write your code in Java SE 8
    	
    	List<String> operArray = new ArrayList<String>();
    	List<String> fakeStack = new ArrayList<String>();
    	
    	int result = 0;
    	StringTokenizer st = new StringTokenizer(S, " ");
		while(st.hasMoreTokens()){
			String tmp = st.nextToken();
			operArray.add(tmp);
		}
		for(int i = 0, size = operArray.size(); i < size; i++){
			if(operArray.get(i).equalsIgnoreCase("POP")){
				fakeStack.remove(fakeStack.size()-1);
			}else if(operArray.get(i).equalsIgnoreCase("DUP")){
				fakeStack.add(fakeStack.get(fakeStack.size()-1));
			}else if(operArray.get(i).equalsIgnoreCase("+")){
				int tmp1 = Integer.parseInt(fakeStack.get(fakeStack.size()-1));
				fakeStack.remove(fakeStack.size()-1);
				int tmp2 = Integer.parseInt(fakeStack.get(fakeStack.size()-1));
				fakeStack.remove(fakeStack.size()-1);
				fakeStack.add(Integer.toString(tmp1+tmp2));
			}else if(operArray.get(i).equalsIgnoreCase("-")){
				int tmp1,tmp2 = 0;
				
				if(fakeStack.isEmpty()){
					result = -1;
					break;
				} else {
					tmp1 = Integer.parseInt(fakeStack.get(fakeStack.size()-1));
					fakeStack.remove(fakeStack.size()-1);
				}
				
				if(fakeStack.isEmpty()){
					result = -1;
					break;
				} else {
					tmp2 = Integer.parseInt(fakeStack.get(fakeStack.size()-1));
					fakeStack.remove(fakeStack.size()-1);
				}
				
				if(tmp1-tmp2 < 0){
					result = -1;
					break;
				} else {
					fakeStack.add(Integer.toString(tmp1-tmp2));
				}
			}else {//int
				fakeStack.add(operArray.get(i));
			}
		}
		if(fakeStack.isEmpty()){
			result = -1;
		} else{
			result = Integer.parseInt(fakeStack.get(fakeStack.size()-1));
		}
		
    	return result;
    }*/
    
	    
	
	/*public static int solution(int[] A) {
		int count = 1;
		Arrays.sort(A);
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < A.length; i++){
			if(A[i] > 0) list.add(A[i]);
		}
		for(int i = 0; i < list.size(); i ++){
		
			if(list.get(i+1) - list.get(i) > 1){
				count = list.get(i)+1;
				break;
			} 
			
		}
		
        return count;
    }*/
}
