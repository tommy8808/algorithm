package java;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicate {

	public static void main(String[] args) {

		String text = "abcdea".toLowerCase();

		List<Character> pureList = new ArrayList<>();
		List<Character> duplicatedList = new ArrayList<>();
	
		for(int i = 0 ; i < text.length(); i++){
			if(!pureList.contains(text.charAt(i))){
				pureList.add(text.charAt(i));
			} else {
				if(!duplicatedList.contains(text.charAt(i)))
					duplicatedList.add(text.charAt(i));
			}
		}

		System.out.println(text);
		System.out.println(duplicatedList.size());
	}

}
