package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
	}
	//scores 밑에 두개는 변수명이 같아야 함
	public static int add(int[] scores) { 
		// var scores 변수 선언됬다랑 동일 = new int[] {83,90,87}
		int sum = 0; 
		for(int i=0; i<3; i++) {
			sum += scores[i];		
		}
		return sum;
	}
}
		// 배열 연산자