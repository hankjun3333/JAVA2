package sec05.exam03;

public class Car {
	//�ڵ� ����Ŭ������ �ۼ�
	int speed;
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		//static �̱� ������ this�� ����
	}
	//�̱����� ������ ���質�� ������� �ִµ� ��ü�� �Ѱ��� ����
	
	
}
