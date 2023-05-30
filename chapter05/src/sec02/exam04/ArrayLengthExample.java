package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		//scores.length = 5; 배열은 한번정해지면 바꿀수가없음 길이 말하는거임
		
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
	}
	
}
