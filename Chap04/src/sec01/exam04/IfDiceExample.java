package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		//1부터 4까지의 난수 : (int)(Math.random()*3)+1;
		int num = (int)(Math.random()*6)+ 1;
		
		if(num==1) {
			System.out.println("1이 나왔수까");
		} else if (num==2) {
			System.out.println("2가 나왓수까");
		} else if (num==3) {
			System.out.println("3이 나왓수까");
		} else if (num==4) {
			System.out.println("4가 나왓수까");
		} else if (num==5) {
			System.out.println("5가 나왓수까");
		} else {
			System.out.println("6이 나왓수까");
		}
	}

}
