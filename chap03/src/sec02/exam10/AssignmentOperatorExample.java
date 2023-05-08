package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		//A = A + B // A+=B 두개 같다 오른쪽걸 쓰도록 하자
		result += 10;
		System.out.println("result= " + result);
		result -= 5;
		System.out.println("result= " + result);
		result *= 3;
		System.out.println("result= " + result);
		result /= 5;
		System.out.println("result= " + result);
		//3으로 나눳을때 나머지 값
		result %= 3;
		System.out.println("result= " + result);
		
		

	}

}
