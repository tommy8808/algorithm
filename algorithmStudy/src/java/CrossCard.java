package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossCard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str1 = "";
		while(scan.hasNext()){
			str1 = str1 + scan.next();
			if(str1.length()>3)
				break;
		}
		//��� ���ڼ� ����Ǽ� ���ϱ�
		List<Integer> timeNumbList = new ArrayList<>();
		for(int i = 1111; i<10000; i++){
			int tmpNumber = findTimeNumber(Integer.toString(i));
			if(!Integer.toString(i).contains("0") && !timeNumbList.contains(tmpNumber))
				timeNumbList.add(tmpNumber);
		}
		
		//���� �ð�� ī���� ���� ���ϴ� ��
		int count = 1;
		
		//�Էµ� �ð��
		int timeNumber = findTimeNumber(str1);
		//1111���� �ð�� ���� ī�����ϱ�
		while(timeNumbList.get(count-1).intValue()<timeNumber)
			count++;
		System.out.println(count);
	}

	//�ð�� ���ϴ� �Լ�
	public static int findTimeNumber(String str) {
		int[] arrays = new int[4];
		arrays[0] = Integer.parseInt(str);
		for(int i = 0; i < str.length()-1; i++){
			char tmpChar = str.charAt(0);
			str = str.substring(1) + tmpChar;
			arrays[i+1] = Integer.parseInt(str);
		}
		Arrays.sort(arrays);
		return arrays[0];
	}
}
