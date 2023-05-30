package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
						//생성자 	방법(메써드) 메써드는 ()괄호 사용
			
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;	
			}
			
			System.out.println("종료");
		}
		
		

	}

}
