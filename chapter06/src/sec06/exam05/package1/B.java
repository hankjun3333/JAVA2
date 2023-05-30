package sec06.exam05.package1;

//생성자에서 접근하는 방법임

public class B {
	
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; 프라이빗이라 접근제한 
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
