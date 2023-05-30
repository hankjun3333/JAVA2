package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		//결합 연산
		//앞엣놈 10이랑 2는 더함 "8"은 문자라 그냥 붙임     128
		String str1 = 10 + 2 +"8";
		System.out.println("str1: " + str1);
		// 앞엣놈 10이랑 2문자랑 더하고 2가 문자니가 8도 문자 취급     1028
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " +str2);
		//앞엣놈 10 문자 뒤에 다 문자       1028
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " +str3);
		//괄호안에 먼저 계산 10문자놈 10     1010
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " +str4);
		//문자형에 int쓰면 에라남 int는 정수형이니까
		
	
		
		
		

	}

}
