package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 =10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; 
		//byte result = value1 + value2 + value3;
		//byte로 바꿔보면 에러뜸
		System.out.println(result);

	}

}
