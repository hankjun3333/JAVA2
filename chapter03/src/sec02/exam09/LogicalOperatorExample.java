package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'a';
		if ((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
			
		}
		if ((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
			
		}
		//48~57
		if ((charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
			//&은 and연산자
		}
		int value = 6;
		// | or연산자임 둘중하나 해당하면 출력
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
			
		}
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
			//기호 하나있는거랑 두개 있는거랑같음
			//value를 2로 나눈 나머지 0이란 뜻
		}
				

	}

}
