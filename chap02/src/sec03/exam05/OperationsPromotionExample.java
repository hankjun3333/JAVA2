package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		long result = bytevalue1 + bytevalue2;
		// 말햇듯이 byte변수+byte 변수 더할땐 int, long 같이 상위변수사용
		
		char charvalue1 = 'A'+1;
		char charvalue2 = 1;
		//char intvalue2 = charvalue1 + charvalue2; char도 마찬가지
		int intvalue2 = charvalue1 + charvalue2;
		
		System.out.println("유니코드=" +intvalue2);
		System.out.println("출력문자=" +(char)intvalue2);
		//char + char 햇다고 해서 무조건 int쓰지만 강제로 char로 변환할수도잇음)
		System.out.println(result);
		System.out.println(intvalue2);
		int intvalue3= 10;
		int intvalue4= intvalue3/4;
		System.out.println(intvalue4);
		//10을 4로 나누면 2.5이지만 int 변수타입이기 때문에 2로만 표기
		
		int intvalue5 =10;
		//int intvalue6 = 10 / 4.0; // 컴파일에러
		//int 변수 값에 나누기를 4(정수) 가 아닌 4.0을 해버리면 컴파일에러가 뜸
		
		double doublevalue= intvalue5 / 4.0;
		System.out.println(doublevalue);
		
		
		
		
		
		
		
		
		
		
		
	}

}
