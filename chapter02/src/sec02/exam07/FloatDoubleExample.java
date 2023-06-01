package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14f;          // 컴파일 에러 (Type mistach) 
		float var2 = 3.14f;
		double var3 = 3.14;
        
		//float이 기본값		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);		
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);		
		
		//e 사용하기
		double var6 = 3e6;  // 3 x 10의 6승 3 x 1000000 = 3백만
		float var7 = 3e6f;  // 소숫점 . 0 나옴
		double var8 = 2e-3; // 2 x 10의 -3승 0.002
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);		
		System.out.println("var8: " + var8);		
	}

}
