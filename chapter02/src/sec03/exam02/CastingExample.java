package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
			System.out.println(charvalue);
			
			long longValue = 500;
			longValue = (int) longValue;
			System.out.println(longValue);
			
			double doubleValue = 3.14;
			doubleValue = (int) doubleValue;
			System.out.println(doubleValue);

	}

}
