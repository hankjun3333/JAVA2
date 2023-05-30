package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// (-2,147,483,648 ~ 2,147,483, 647) 이 범위를 넘으면 long 써야함
		
		long var1 = 10;
		long var2 = 20L;
			//long var3 = 10000000000; 컴파일 에러
		long var4 = 10000000000000L;
			//long byte ing ----변수형 ,변수타입
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
