package sec03.exam01;

public class SmartPhone extends Phone{
	//추상클래스에서는   반드시 부모꺼 생성자 불러와야 빨간불안들엉모옴
	//생성자
	//부모가 추상클래스인 경우 자식클래스에서 부모 상속할때 super통해서 생성자 만들어줘야 됨ㅋ
	
	//근데 오버라이딩 메소드 재정의 할때는 반드시 부모꺼를 재정의 해야 됨 이건 내일함ㅋ 
	public SmartPhone(String owner) {
		super(owner);
		
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
