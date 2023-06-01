package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	//내것처럼 사용가능 셀폰을 public ,protected까지
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		//this.model = model;
		//this.color = color;
		super(model, color);
		this.channel = channel;
		//부모가 명시적으로 매개값ㅇ을 받는 생성자가 있을 경우 자식 클래스를 작성할때 super()로 부모 생성자를
		//호출할때 파라미터에 맞게 올바르게 호출할 수 있도록 만들어주지 않으면 컴파일 에러가 발생
		
		//부모에서 생성자 만들어보리면 생성자 실행안됨 없을땐 마음대로 지것대로 사용
		//부모에게 생성자가 없으면 상속받은놈이 맘대로 자유자재로 사용하는데
		//부모가 생성자가 있으면 맘대로는 못쓰고 super()로 부모걸 불러와야한단말씀 ㅋ

		
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
		
	}
	
	
	
}
