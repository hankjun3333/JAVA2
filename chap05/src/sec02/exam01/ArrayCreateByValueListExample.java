package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] scores = {83, 90, 87}; //선언과 동시에 값을 집어넣는 방법
		
		int[] scores2;
		scores2 = new int[] {83, 90, 87}; // 참조변수를 선언하듯 값을넣는방법
		System.out.println("scroes[0] : " + scores2[0]);
		System.out.println("scroes[1] : " + scores2[1]);
		System.out.println("scroes[2] : " + scores2[2]);
		
		int sum = 0;
		for(int i = 0; i<scores2.length; i++) {
			sum +=scores2[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double)sum / scores2.length;
		System.out.println("평균: " + avg);
	}
}
