package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//int�� ������ �迭 �̸��� arr1 �����迭 ������ ���� ���� 3�� ¥���� ������ ������
		//������ �ְ� ���� ������ �̷��� ǥ��
		int[] arr1 = new int[3]; 
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[1]);
			
		}
		System.out.println("");
		//double������ arr2 ���� 3�� ����
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
		//�迭�� �ѹ� ���̰� �������� ���ٲ㼭 ����� �ٽ� ����� �����ϴ½����� ����
				//���ڿ��� ������ �迭 �̸��� arr3 ���� �迭 ������ ���� ���� 3�� ¥�� �����Ͻÿ�
		
		
		
		System.out.println("");
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[1]);
		

	}
	}
	}
