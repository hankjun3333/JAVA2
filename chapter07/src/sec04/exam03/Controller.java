package sec04.exam03;

public class Controller {
	public MemberService service;
	public void setService (MemberService service) {
		this.service = service;
	}
	
}


Controller controller = new Controller();
Controller.setService(___________);

//부모 자식 호적 정리
//서비스 밑에 멤버서비스 밑에 a서비스 b서비스 잇다  //서비스 밑에 보드서비스 d서비스 잇다

//1.new service 응못해
//2.new member서비스 지꺼 지가 하겟다는데
//3.a서비스 멤버 서비스 자식이니까 가능
//4.b서비스 멤버 서비스 자식놈이니까 가능
//5. 보드서비스 형제니까 안돼
//6. d 서비스 조카니까 안돼
