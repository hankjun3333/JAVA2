package sec05.exam04;

public class Singleton {
	//정적ㅋ필드 객체 생성을 통해서 생성한 정적필드라고함 ㅋ
	private static Singleton singLeton = new Singleton();
	
	//싱글톤엔 객체 생성을 해야 되고 메소드 앞에 클래스도 붙여줘야됨
	
	//첫번째 객체 형 두번째 객체 이름
	//얘는 생성자임
	private Singleton() {}
	
	//얘는 정적 메소드임 생성자는 정적못붙임
	static Singleton getInstance() {
		return singLeton;
		//메소드는 리턴타입이 있어야되는데 
	}
	
	
	
}
