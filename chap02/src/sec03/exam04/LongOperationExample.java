package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		
		// long result 말고 int result byte result 하면 다 오류남
		// 상위 변수를 사용해야 함 변수끼리 더할땐 항상
		System.out.println(result);
		
		
		
		
		
		

	}

}
