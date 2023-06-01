package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void brathe() {
		System.out.println("숨을 쉽니다.");
		
	
	}
	public abstract void sound();  //추상메소드는 오버라이딩 바로 해줘야됨
	// 중괄호없음 이름ㅁ만 지정한다는거임 animal 상속받으면 반드시 이 이름을써야됨
	//실행블럭이 없음 ,상속받으면 오버라이딩 써야됨 반드시
	
}
