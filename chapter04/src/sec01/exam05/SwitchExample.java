package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		//정해진 값이 있을 경우는 스위치문을 더 많이씀
		//if같은경우는 범위를 나타낼때 유리함
		
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}
		

	}

}
