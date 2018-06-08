package java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;	
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] binary = new String[5];
		int[] arr3 = new int[5];
		for( int i= 0; i< arr1.length; i++){
			//binary[i] = Integer.toBinaryString(arr1[i]) | Integer.toBinaryString(arr2[i]);
			arr3[i] = arr1[i] | arr2[i];
		}
		for( int i = 0; i< binary.length; i++){
			String target = Integer.toBinaryString(arr3[i]).toString();
			binary[i] = target.replace('1', '#');
			
		}
		for( int i = 0; i< binary.length; i++){
			String target = Integer.toBinaryString(arr3[i]).toString();
			binary[i] = binary[i].replace('0', ' ');
			
		}
		for (String i : binary) {
			System.out.println(i);
			
		}*/

		/*
		String points = "1S2D*3T";
		
		int first = 0;
		int second = 0;
		int third = 0;
		String firstGroup = "";
		String secondGroup = "";
		String thirdGroup = "";
		
		StringTokenizer st = new StringTokenizer(points, "*");
		while(st.hasMoreTokens()){
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
		
		
		
		String regex = "^(S)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(points);
		if(m.matches()){
			System.out.println("matches");
			firstGroup = m.group(0);
			secondGroup = m.group(1);
			thirdGroup = m.group(2);
			for (int i = 0; i <m.groupCount(); i++){
				System.out.println(m.group(i));
				
			}
		} else{
			System.out.println("not match");
		}
		
		*/
		/*
		int a =0;
		String b = "1219950180111108236115111016623101401611235115012312161151110101111127";
		String reversedB = "";
		
		for (int i = b.length(); i> 0 ; i--){
			reversedB+= b.charAt(i-1);
		}
		
		int[] charArray = new int[b.length()/2];
		int j = 0;
		for (int i = 0; j< reversedB.length() ; i++){
			if(reversedB.charAt(j) == '1'){
				
				charArray[i] = Integer.parseInt(reversedB.substring(j, j+3));
				System.out.println(charArray[i]);
				j+=3;
			} else{
				charArray[i] = Integer.parseInt(reversedB.substring(j, j+2));
				System.out.println(charArray[i]);
				j+=2;
			}
		}
		
		String answer = "";
		String dAnswer = "";
		for(int i = 0 ; i< charArray.length; i++){
			answer += charArray[i];
			dAnswer += Character.toString((char) charArray[i]);
		}
		
		System.out.println(dAnswer);
		System.out.println(answer);
		
		
		
		System.out.println(reversedB);
		b = Character.toString((char) 72);
		System.out.println(b);
		*/
		
		
		/*
		int[] collection = {3,1,3,4};
		int d = 7;
		int cIdx =0;
		int[] dList = new int[10];
		int dSum = 0;
		int dIdx = 0;
		Arrays.sort(collection);
		for(int i =0 ; i< collection.length; i++){
			if(collection[cIdx]+1 <= collection[cIdx+1]-1
					&& dSum <= d 
					&& collection[cIdx] != collection[cIdx+1]){
				
				dList[dIdx] = collection[cIdx]+1;
				//System.out.println(dList[dIdx]);
				dSum += dList[dIdx];
				while((dList[dIdx] < collection[i+1]-1) && dSum <= d ){
					int tmp = dList[dIdx];
					dIdx++;
					dList[dIdx] = tmp+1;
					dSum += dList[dIdx];
					//System.out.println(dList[dIdx]);
				}
				
				
			}
			if(cIdx < collection.length-2){
				cIdx++;
			}else{
				break;
			}
			
		}
		for (int i : dList) {
			System.out.println(i);
		}
		System.out.println(dSum);
		
		
		*/
		
		
		
	//boolean test = isUniqueChar("dfasixvmd");
	
	//
		


	
	//boolean test = solution(testArray);
	
	//System.out.println(test);
	}
	
	public static boolean isUniqueChar(String str) {
		/*System.out.println(str.length());
		for(int i = 0; i < str.length(); i++){
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;*/
		
		
	    if (str.length() > 256) return false;
	    
	    boolean[] char_set = new boolean[256];
	    for(int i = 0; i < str.length(); i++) {
	        int val = str.charAt(i);
	        System.out.println(val);
	        System.out.println(char_set[val]);
	        if (char_set[val]) {
	            return false;
	        }
	        char_set[val] = true;
	    }
	    return true;

	}
	
	
	public static boolean solution(int[] arr) {
        boolean answer = true;
        int leng = arr.length;
        boolean[] cu = new boolean[leng+1];
        System.out.println("dd:"+ cu[0]);
        System.out.println("dd:"+ cu[1]);
        System.out.println("dd:"+ cu[3]);
        for(int i=0;i<leng;i++){
            int temp = arr[i];
            if(temp > leng) return false;
            if(cu[temp] == true) {
            	System.out.println(temp + " ->!!"+cu[temp]);
                return false;
            }else{
                cu[temp] = true;
            }
            
            System.out.println(temp + " ->cc:"+ cu[temp]);
        }
        
        return answer;
    }


	

}
