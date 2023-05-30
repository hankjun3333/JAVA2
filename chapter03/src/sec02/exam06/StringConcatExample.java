package sec02.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //jdk뒤에 다 문자열 취급
		String str4 = 3 + 3.0 + "JDk"; 
		//앞자리 한번정도는 그냥더해줌 3+3.0
		System.out.println(str3);
		System.out.println(str4);
	}

}
