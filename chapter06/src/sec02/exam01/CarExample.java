package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car a = new Car();
		
// 클래스 자료형 클래스 변수명 = 생성자 호출형
		System.out.println(a.company);
// a = 객체
		System.out.println(a.model);
		System.out.println(a.color);
		System.out.println(a.maxSpeed);
		System.out.println(a.speed);
		
		a.speed = 60;
		System.out.println(a.speed);
			
	}

}
