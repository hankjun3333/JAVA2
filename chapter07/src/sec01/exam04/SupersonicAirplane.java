package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
		
		//오버라이드 한놈이 실행이 된다 재 정의한놈
		//싱글톤만드는법 연습하기 시험나옴
		
	}
	
	
	
	
	
	
	
	
	
	
}
