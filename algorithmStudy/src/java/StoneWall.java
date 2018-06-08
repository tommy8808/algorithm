package java;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {

		int[] H = {8,8,5,7,9,8,7,4,8};
		System.out.println(solution(H));
	}

	public static int solution(int[] H) {
        int num = 0;
        
        Stack<Integer> st = new Stack<>();
        for(int h : H){
        	while(!st.isEmpty() && st.peek() > h){
        		st.pop();
        	}
        	if(st.isEmpty() || st.peek() < h) {
        		st.push(h);
        		num++;
        	}
        }
        return num;
    }
}
