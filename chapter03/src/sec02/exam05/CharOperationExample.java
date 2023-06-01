package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //char가 문자를 숫자로 인식은 해주는역할 출력은 문자로
		char c2 = 'A';
		//char c3 = c2 + 1; //컴파일 에라  c2는 int로 인식한다
		//새로운 변수에 담을라고 하면 이건안됨
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		
		
	}

}
