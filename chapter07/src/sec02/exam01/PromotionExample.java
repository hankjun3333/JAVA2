package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B(); 
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;  //부모에다 넣는건 가능 자동형변환이라고 함
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; e가 b와 ㅅ전혀 상속관계가 없어서 안됨 자동형변환이안댐
		//C c2 = d; 

	}

}
