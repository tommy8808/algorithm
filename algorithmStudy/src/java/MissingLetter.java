package java;

public class MissingLetter {

	public static void main(String[] args) {
		char[] newArray = {'a', 'b', 'c', 'e'};
		char result = findMissingLetter(newArray);
		
		System.out.println(result);

	}
	

	public static char findMissingLetter(char[] array) {
		for(int i = 0, size = array.length; i < size; i++)
			if ((array[i]+1) != array[i+1])	return (char) (array[i]+1);
		return ' ';
	}

}
