package sec02.exam03;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' ;   //문자를 직접 저장    
		//char c1 = "A" ;   //char라는 변수타입 에는 반드시 홑따옴표를 사용
		char c2 = 65 ;   //문자를 십진수로 저장 A가 65 정도인 것정도는 알아두자 a는 97
		char c3 = '\u0041';    //문자를 16진수로 저장	
		
		char c4 = '가';      // 문자를 직접 저장
		char c5 = 44032;      // 십진수로 저장		
		char c6 = '\uac00';      // 16진수로 저장		
		
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);		
		System.out.println(c4);		
		System.out.println(c5);
		System.out.println(c6);
	}

}
