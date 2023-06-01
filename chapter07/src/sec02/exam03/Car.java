package sec02.exam03;

public class Car {
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2); //금호타이어들어옴 지금 금호타이어 오버라이드된 메소드 쓰겟지
	Tire backLeftTire = new Tire("뒤 왼쪽", 3); //한국타이어들어옴 한국타이어메소드 오버라이드된거쓰겟지
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;};
		if(frontRightTire.roll()==false) {stop(); return 2;};
		if(backLeftTire.roll()==false) {stop(); return 3;};
		if(backRightTire.roll()==false) {stop(); return 4;};
		return 0; //이건왜하는지?
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
