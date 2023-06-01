package sec02.exam04;

public class Driver{ //Vehicle클래스 변수형 vehicle 변수 메소드안에 매개변수로 변수생성
	//Driver drive = new Driver();
	
	public void drive(Vehicle vehicle) { //var Vehicle vehicle = Bus bus
		vehicle.run();  
		
		//자식클래스에서도 부모로 부터 상속을 받으면 부모 메소드를 자유자재로 사용할수 잇다
	}
	
}
