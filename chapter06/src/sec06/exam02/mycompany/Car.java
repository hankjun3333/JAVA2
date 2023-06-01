package sec06.exam02.mycompany;

//import sec06.exam01.SnowTire; 클래스 복사해오면 import안해도댐
import sec06.exam02.hankook.*; // Tire
import sec06.exam02.kumho.*; // BigWidthTire , Tire
import sec06.exam02.hyndai.Engine; 
//바로 불러올라면 이렇게도 가능 부룰수 있는지없는지는 객체를 만들어보면됨

public class Car {
	//필드
	Engine engine = new Engine(); //이건 생성자  //자료형=클래스 Engine engine 필드선언
	//메소드는 Engine.Engine() 이런거 클래스.메소드()
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//Tire tire3 = new Tire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	//이렇게 패키지명 써줘야 타이어 생성자 인식함 근데 이렇겐 잘안쓴다고함ㅋ
}





