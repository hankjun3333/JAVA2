package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		// 실제 float 0.1값은 0.100000000149011612 소숫점에서 문제가 있음
			//double을 float으로 강제 형변환 햇을땐 ㄱㅊ 3번째 처럼
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
		//10을 곱한건 소숫점을 없앴다는 의미
		
		
		
		
	}

}
