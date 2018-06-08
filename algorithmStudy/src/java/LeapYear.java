package java;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		if(n % 4 == 0){
			if(n % 100 == 0 && n % 400 != 0){
				System.out.println("Not Leap Year");
			} else{
				System.out.println("Leap Year");
			}
		} else{
			System.out.println("Not Leap Year");
		}
	}

}
