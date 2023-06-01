package sec04.exam01;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //부모를 호출하거나,this.name을안쓰거나,
					//super()메소드 사용
		this.name = name;
		this.studentNo = studentNo;
		
		
	}

}
