package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032; //intvalue를 charvalue로 바꾸겟단 뜻 
		 char charvalue = (char) intvalue;//char는 char charvalue로 써줘야함
			System.out.println(charvalue);
			
		long longvalue = 500;
		longvalue = (int) longvalue;
		System.out.println(intvalue);
		
		double doublevalue = 3.14;
		doublevalue = (int) doublevalue;
		System.out.println(doublevalue);
		
		
		
		
		
		

	}

}
