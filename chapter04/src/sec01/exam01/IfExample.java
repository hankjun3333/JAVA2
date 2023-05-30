package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		// 중괄호로 묶어줘야 sysout이 전체를 인식함
		// 괄호를 안넣으면 바로 밑에 한줄만 인식하는게 if문임ㅋ
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90) {
			
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		

	}

}
