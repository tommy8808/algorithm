package java;

public class FrogJmp {

	public static void main(String[] args) {

		System.out.println(solution(1,5,2));
	}

	
	public static int solution(int X, int Y, int D) {
		int num = 0;
		if(X > 0 && Y > 0 && D > 0){
			if((Y-X) % D > 0){
				num = ((Y-X)/D) +1;
			} else{
				num = ((Y-X)/D);
			}
		}
        return num;
    }
}
