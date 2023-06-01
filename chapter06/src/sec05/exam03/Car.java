package sec05.exam03;

public class Car {
	//자동 실행클래스로 작성
	int speed;
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		//static 이기 때문에 this를 못씀
	}
	//싱글톤은 무조건 시험나옴 만들수는 있는데 객체가 한개만 생성
	
	
}
