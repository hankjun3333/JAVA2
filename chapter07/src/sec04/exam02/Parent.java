package sec04.exam02;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
		
	}
	
	public Parent(String nation) { //String 타입으로 nation 이라는 값이 생기면 실행됨)
		this.nation= nation;
		System.out.println("Parent(String nation) call");
	}
}

//부모가 명시적으로 생성자 만들엇을땐 자식에선 super()를 해줘야되고
//여기서 this("대한민국"); 이건 String nation으로 들어갓다가
//String nation 12번줄로 바로 들어감