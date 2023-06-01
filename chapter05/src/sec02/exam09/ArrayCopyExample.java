package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
	


		//원본배열, 시작 인덱스, 새 배열, 새배열 시작 인덱스, 복사할 갯수 순서
	
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
		
	}
}
