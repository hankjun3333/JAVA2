package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("네 안사요");
		dmbCellPhone.bell(); 
		dmbCellPhone.sendVoice("아 ~ 예 반갑습니다.");
		dmbCellPhone.receiveVoice("아안녕하세요 저는 홍길동인데요 네 안사요");
		dmbCellPhone.hangUp(); 
		dmbCellPhone.turnOnDmb();
		
		dmbCellPhone.turnOffDmb();
	}

}
