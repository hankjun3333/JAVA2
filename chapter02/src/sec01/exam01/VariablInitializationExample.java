package sec01.exam01;

public class VariablInitializationExample {
	public static void main(String[] args) {
		//int x = 3;
		//int y = 5;
		//System.out.println("x:" + x + ",y:"+ y );
		
		//int temp = x; // temp=3
		//x = y; // x = 5
		//y = temp;
		//System.out.println("x:" + x + ",y:" + y);
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x +", y:" +y);
		
		 //변수 x와 y를 바꿀때는 temp 일시적인 변수를 사용하여 바꾼다
		x = y; 
		y = x;
		System.out.println("x:" + x +", y:" + y);
		
		
		
		
		
		
		
		
		
	}
	
}
