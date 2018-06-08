package java;

public class wowa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		String input1 = "1 3";
		String input2 = "2 4";
		String input3 = "5 6";
		
		String[] array1 = input1.split(" ");
		String[] array2 = input2.split(" ");
		String[] array3 = input3.split(" ");
		
		if(Integer.parseInt(array2[0]) - Integer.parseInt(array1[1]) <= 0){
			System.out.println("["+array2[0]+","+array1[1]+"]");
		} else{
			System.out.println("("+array1[1]+","+array2[0]+")");
		}
		
		for(int i = 1; i <= n; i++){
			String tmpA = "array"+i+"[1]";
			String tmpB = "array"+(i+1)+"[0]"; 
			if(Integer.parseInt(tmpB) - Integer.parseInt(tmpA) <= 0){
				System.out.println("["+array2[0]+","+array1[1]+"]");
			} else{
				System.out.println("("+array1[1]+","+array2[0]+")");
			}
		}
		
	}

}
