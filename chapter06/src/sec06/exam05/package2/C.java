package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	
		public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; //접근제한이 디폴트라 제한당함 //getFiedl return값이 있음
		//a.field3 = 1; 프라이빗이라 접근제한 
		
		a.method1();
		//a.method2();
		//a.method3();
	}
	
	
}
