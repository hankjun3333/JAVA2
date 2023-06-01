package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류"; //애니머ㅏㄹ 필드 kind에 포유류 집어때려넣음
	}
	
	@Override
	public void sound() {
		System.out.println("칼칼");
	}
	
	
}
