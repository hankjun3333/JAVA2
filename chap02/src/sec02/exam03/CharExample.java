package sec02.exam03;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		//char c1 = 'A' // char 라는 변수에는 반드시 홑따옴표 사용
		char c2	= 65;
		char c3 = '\u0041'; //문자를 16진수로 저장
			
		char c4 = '가';
		char c5 = 44032; // 10진수로 저장
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
	}

}
