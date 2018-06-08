package java;

import java.util.StringTokenizer;

public class Calculator {

	public static void main(String[] args) {

		int sum = evaluate("24+2+0");
		
		System.out.println(sum);
	}

	
	public static int evaluate(String expression) {
		int sum = 0;
		StringTokenizer st = new StringTokenizer(expression, "+");
		while(st.hasMoreTokens()){
			sum += Integer.parseInt(st.nextToken());
		}
		
		return sum;
	}
}
