package sec01.exam06;

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	//final 메소드는 재정의 할수없다 오버라이딩할수 없다 라는 게 중요 바꿀수가없다
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
		
	}
}
