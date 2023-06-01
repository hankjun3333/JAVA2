package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//phone 해서 만드는게안됨
		//Phone phone = new Phone(); (X)
		//부모가 추상클래스인경우 자식 통해서 객체생성해야 됨
		//그냥 상속하고의 차이점은 부모 클래스의 새로운 객체 생성이 안됨 자식 통해서 한다고 봐야댐
		//부모 메소드까지는 사용이 가능하다
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
