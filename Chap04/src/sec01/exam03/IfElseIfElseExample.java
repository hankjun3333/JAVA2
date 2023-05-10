package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 69;
		
		if(score>100) {
			System.out.println("점수가 100점입니다");
		} else if(score>=90) {
			System.out.println("점수가 90점~100점입니다");			
		} else if(score>=80) {
			System.out.println("점수가 80점~90점입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70점~80점입니다.");
		} else {
			System.out.println("탈락입니다.");
		}
		

	}

}
