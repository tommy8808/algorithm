package java;

import java.util.Random;

public class myLibrary {

	//2�� �迭 ���� ����
	void shuffle(int[][] a) {
	    Random random = new Random();

	    for (int i = a.length - 1; i > 0; i--) {
	        for (int j = a[i].length - 1; j > 0; j--) {
	            int m = random.nextInt(i + 1);
	            int n = random.nextInt(j + 1);

	            int temp = a[i][j];
	            a[i][j] = a[m][n];
	            a[m][n] = temp;
	        }
	    }
	}
}
