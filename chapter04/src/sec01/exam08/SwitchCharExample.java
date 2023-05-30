package sec01.exam08;

public class SwitchCharExample {

	public static void main(String[] args) {
		//break가 없으면 실행이 쭉됨
		char grade = 'A';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
		
		

	}

}
