package java;

public class Woowa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 700;
		int y1 = 400;
		int x2 = 1600;
		int y2 = 1100;
		int x3 = 0;
		int y3 = 400;
		int x4 = 1100;
		int y4 = 900;
		int x5 = 900;
		int y5 = 0;
		int x6 = 1800;
		int y6 = 650;
		
		
		int area1 = Math.abs(y2-y1) * Math.abs(x2-x1);
		int overlappedArea2 = 0;
		int overlappedArea3 = 0;
		int overlapppedArea2and3 = 0;
		
		if((x4-x1) > 0 && (y4-y1) > 0){
			overlappedArea2 = (x4-x1) * (y4-y1);
		}
		
		if((y6-y1) > 0 && (x2-x5) > 0){
			overlappedArea3 = (y6-y1) * (x2-x5);
		}
		           
		
		if((x4-x5) > 0 && (y6-y3) > 0){
			overlapppedArea2and3 = (x4-x5) * (y6-y3);
		}
		int answer = area1 - overlappedArea2 - overlappedArea3 + overlapppedArea2and3;
		System.out.println(answer);
	}

}
