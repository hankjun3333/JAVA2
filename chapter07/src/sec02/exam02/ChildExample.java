package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		 parent.method1();
		 parent.method2();
		 //parent.method3();
		//이제 child가 부모클래스로 자동타입변환이 되서 자식놈 메소드를 사용할수없음
		//저거 8번줄 안쓰고 child.method2();쓴다면 이놈은 오버라이딩해서 child소속으로 바뀜
		 //드문경우지만 parent 메소드 호출이 필요할때가 있다 그건다음예제라 한다 ㅋ
		 
	}

}
