package java;

public class FindDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb.append(n).toString());
	}

}
