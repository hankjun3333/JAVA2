package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		double result3 = myCalc.divide(10.5, 20.5);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		myCalc.powerOff();
	}

}
