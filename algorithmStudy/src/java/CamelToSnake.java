package java;

public class CamelToSnake {

	public static void main(String[] args) {
		//스트링 변수명을 받아 카멜표기법이면 스네이크표기법으로, 스네이크면 카멜표기법으로 바꾸는 함수 구현
		String test = "";
		System.out.println(solution(test));

	}

	public static String solution(String s){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0, size = s.length(); i < size; i++){
			if(s.charAt(i) == '_'){
				sb.append(Character.toUpperCase(s.charAt(i+1)));
				i++;
			} else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				sb.append(Character.toUpperCase('_')).append(Character.toLowerCase(s.charAt(i)));
			} else{
				sb.append( s.charAt(i));
			}
		}
		
		return sb.toString();
	}
}
