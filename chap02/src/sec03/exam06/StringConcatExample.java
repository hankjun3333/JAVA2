package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산 경우 한번은 더하는데 두번은 못더함 멍청한놈 
		int value1 = 10 + 2 +8;
		System.out.println(value1);
		//결합연산
		//맨앞 한놈씩 정도는 숫자로 결합하는데 그 뒤로는 결합못함 멍청한놈
		// String str1 = 10 + 2 + 8; //컴파일 에라
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		String str2 = 10 + "2" + 8; 
		// 두번째 문자열이 왓으므로 세번째도 문자열취급
		System.out.println(str2);
		String str3 = "10" + 2 + 8;
		//첫번째 부터 문자열왓으므로 뒤에도 싹다 문자열 취급
		System.out.println(str3);
		String str4 = "10" + (2+8);
		System.out.println(str4);
		
		
		
		
		
		
		

	}

}
