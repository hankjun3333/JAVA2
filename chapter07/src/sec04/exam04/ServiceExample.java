package sec04.exam04;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.setService(new Service()); 얘는 안됨 컨트롤러에서 멤버서비스로 매개변수받아서
		//controller.service.login(); 
		controller.setService(new MemberService());
		controller.service.login();//-멤버로그인찍힘
		controller.setService(new AService());
		controller.service.login();
		//매개변수를 뭘넣냐에 따라 실행결과달라짐
		//-A로그인찍힘	//이것이 바로 매개변수의 다형성이다
		 
		
	}

}
