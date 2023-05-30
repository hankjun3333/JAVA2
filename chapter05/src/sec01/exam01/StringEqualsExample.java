package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "박병준";
		String strVar2 = "박병준";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같음");
		
		 } else {
			 System.out.println("strVar1과 strVar2는 참조가 다름");
		 }
		
		
		String strVar3 = "박병준";
		String strVar4 = "박병준";
		
		if(strVar3 == strVar4) {
			System.out.println("strVAr3과 strVar4는 참조가 같음");	
		} else {
			 System.out.println("strVar3과 strVar4는 참조가 다름");
			
		}
		
		if(strVar3.equals(strVar4)) {
				System.out.println("strVar과 strVar4는 문자열이 같음");
			
		}
			//문자열이 같음을 확인할땐 메서드 인 .equals()를 사용해야 한다
		
		
		
		

	}

}
