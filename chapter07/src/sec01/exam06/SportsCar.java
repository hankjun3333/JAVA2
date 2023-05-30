package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	//final 이라서 stop()메소드는 재 정의가 안됨
	//@Override
	//public final void stop() {
		//System.out.println("차를 멈춤");
		//speed = 0; }
	
	
}
