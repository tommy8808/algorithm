package java;

public class BreakingChocolate {
	public static void main(String[] args) {
		int result = breakChocolate(4, 4);
		System.out.println(result);
	}
	
	public static int breakChocolate(int n, int m) {
		int cntCut = 0;
		
		for(int i = n; i > 0; i--){
			if(i > 1) cntCut++;
			for(int j = m; j > 1; j--) cntCut++;
		}
		
		return cntCut;
	}
}
