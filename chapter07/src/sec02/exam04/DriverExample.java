package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		//Vehicle vehicle = bus; 의 의미를 가짐 자동 타입변환
		
		

	}

}
