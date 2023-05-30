package sec01.exam02;

public class VariablintializationExample {

	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			
		}
		 int v3 = v1 + v2; // 이런식으로 변수 밖에서 v2를 참조할라면 참조가 안됨
		// 변수는 괄호 안에서만 사용해야 된다
	}	//System.out.println(v2)
		//sysout 이라쓰고 Ctrl+Space 를 눌러라
		//int는 정수 (자료형,변수형)
}
