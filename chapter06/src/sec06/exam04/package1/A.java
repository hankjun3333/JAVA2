package sec06.exam04.package1;

//class에 붙일수 있는건 public 아님 디폴트 ,private 못붙임 주로 퍼블릭 많이 붙임
public class A {

	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b) {} //아무것도 안썼으니까 default임 ㅋ private<default<protect<public
	private A(String s) {}
	
}
