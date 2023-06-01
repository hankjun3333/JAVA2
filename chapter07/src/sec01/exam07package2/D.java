package sec01.exam07package2;

import sec01.exam07package.A;
//상속하고 임폴트해우저ㅑ야됨
public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
		
		//익숙하게 보게될 문법이란 거지 다른패키지 클래스를 상속하는방법임
	}
}
