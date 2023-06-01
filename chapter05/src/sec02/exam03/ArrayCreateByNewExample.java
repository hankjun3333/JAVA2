package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//int형 가지는 배열 이름이 arr1 참조배열 형태의 선언 길이 3개 짜리를 선언해 보세요
		//갯수는 있고 값만 없으니 이렇게 표기
		int[] arr1 = new int[3]; 
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[1]);
			
		}
		System.out.println("");
		//double형으로 arr2 길이 3개 선언
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[1]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			
			System.out.println("arr3[" + i + "] : " + arr3[1]);
		}
		//배열은 한번 길이가 정해지면 못바꿔서 긴것을 다시 만들고 복붙하는식으로 하자
				//문자열을 가지는 배열 이름이 arr3 참조 배열 형태의 선언 길이 3개 짜리 선언하시오
		
		
		
		System.out.println("");
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[1]);
		

	}
	}
	}
