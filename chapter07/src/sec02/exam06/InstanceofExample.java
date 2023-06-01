package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		//parent 가 Child 의 객체가 맞아? 라는뜻 확인용으로 하기
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); //태생이 부모
		method1(parentB); //이건 Child의 객체가 아니라는 뜼
		method2(parentB); // if문으로 아닌경우를 처리를 해줘야됨ㅋ 예외처리
		
		
		
		
		
		
		
		
		
		
		

	}

}
