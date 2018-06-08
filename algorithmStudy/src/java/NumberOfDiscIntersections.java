package java;

import java.util.Arrays;
import java.util.Comparator;

public class NumberOfDiscIntersections {

	public static void main(String[] args) {

		//못품
		int[] A = {1,5,2,1,4,0};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		/*if (num > 10000000){
			return -1;
		}*/
		class Circle {
			long min, max; 
		}
		
		int N = A.length;
		Circle[] circles = new Circle[N];
		for (int i = 0; i < N; i++) {
			Circle circle = new Circle();
			circle.min = (long)i - A[i];
			circle.max = (long)i + A[i];
			circles[i] = circle;
		} 
		Arrays.sort(circles, new Comparator<Circle>() {
			@Override public int compare(Circle o1, Circle o2) {
				if (o1.min > o2.min) {
					return 1; 
				} else {
					return -1; 
				} 
			}
		});
		
		
		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N && circles[i].max >= circles[j].min; j++) {
				count++; 
				if (count > 10E6) {
					return -1; 
				} 
			} 
		} return count;
    }
}
