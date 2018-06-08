package java;

public class WBSecondTest {

	public static void main(String[] args) {

		System.out.println(solution(1040, 1, 10, 5));
	}

	public static int solution(int n, int d, int k, int j) {
		if(n < 1 || n > 10000000 || k < 1 || k > 1000000 || j < 1 || j > 1000000){
			return 0;
		}
		
		boolean[] array = new boolean[n];
		int c = k, p = 0;
		// c=�̵��� Ƚ��-�ʱ� k��ŭ ����, p = ������ġ
			
		for(int m = 1; m <= n; m++){//��� �Ѹ��������� �ݺ�
			for(int i = 0; i < c; i++){//c��ŭ ī��Ʈ
				p = p + (d == 0 ? -1 : 1); // �ð�����̸� +1, �ݽð�� -1
				if(p >= n) p = p%n; // �迭 ���������� �Ѿ�� �ٽ� ���ʺ���
				if(p < 0) p = n + p;// �迭 �������� �Ѿ�� �ٽ� �����ʺ���
				if(array[p]) i--; //�̹� �ƿ��� ����̸� ��������
			}
			array[p] = true;
			c = (k+(m*j));
			System.out.println("out:"+(p+1)+"��");
		}
			
		return p+1;
	}
}


/*for(int i = k; n > 0;){
if(i >= length) {
	i -= length;
}
System.out.println("i��:"+i);
if(array[i]){
	i++;
} else if(!array[i] && n == 1){
	if(i == 0) i = length;
	lastN = i;
	System.out.println("last:"+(i+1) +"��");
	break;
} else if(!array[i] && n != 1){
	array[i] = true;
	System.out.println("out:"+(i+1)+"��");
	n--;
	k = k+j;
	System.out.println("k����:"+k);
	i += k;
	
	System.out.println("k����i:"+i);
}
if(i >= length) {
	i -= length;
	i++;
}

}*/