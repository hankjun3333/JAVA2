package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 101;
		// else 앞에는 조건문 없음 if에만 조건문옴
		// 점수는 100점이 만점입니다 만들기
		
		//다시해보기
		
		if(score>100) {
			System.out.println("점수가 100입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score>=90) {
			System.out.println("점수가 90점이상 입니다");
			System.out.println("등급은 당연히 A입니다"); 
		} else if(score>=80) {
			System.out.println("점수가 80~90점 입니다");
			System.out.println("등급은 당연히 A입니다");
		} else if(score>=70) {
			System.out.println("점수가 70~80 입니다");
			System.out.println("등급은 B입니다.");
		} else  {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C입니다.");
		} 
	}
}
