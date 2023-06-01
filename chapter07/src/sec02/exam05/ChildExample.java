package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.field2; // 이건 사용 못함 Child가 parent에 넣어서 Parent 부모로 형변환됨
		//당연히 Child에 있는 method3도 사용이안됨 
		//parent.method3();
		
		//Child child = (Child) parent; 부모가 된 parent를  Child로 
		//강제 형변환하면 child 필드값이나 메소드 사용가능
		//child.field2 = "data2";
		//child.method3();
	}

}
