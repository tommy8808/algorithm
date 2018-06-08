package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddOccurrencesInArray {

	public static void main(String[] args) {

		int[] array = {2};
		
		System.out.println(solution(array));
	}

	public static int solution(int[] A) {
      //�迭�� �ߺ�����1
        /*List<Integer> arrayList = Arrays.asList(3,4,4,3,2,2,5);
        HashSet<Integer> distinctData = new HashSet<Integer>(arrayList);
        arrayList = new ArrayList<Integer>(distinctData);*/
        //�迭�� �ߺ�����2
        /*List<Integer> uniqueItems = new ArrayList<Integer>(new HashSet<Integer>(arrayList));
        n =  uniqueItems.get(1);*/
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) list.add(A[i]);
        Collections.sort(list);
        int i = 1;
        /*while(i < list.size() - 1){
          //Check if i and i+1 are the same element. If so, remove both
          if(list.get(i).equals(list.get(i+1))){
            //Remove i twice - effectively removes i and i+1
        	  list.remove(i);
        	  list.remove(i);
        	  i = Math.max(0, (i - 1));
          } else{
        	return list.get(i);
          }
        }*/
        Arrays.sort(A);
        if(A.length > 1){
        	 while(i<A.length){
             	if(A[i-1] == A[i]){
             		i = i +2;
             	} else{
             		return A[i-1];
             	}
             }
        	 return A[A.length-1];
        } else {
        	return A[0];
        }
       
    }
}
