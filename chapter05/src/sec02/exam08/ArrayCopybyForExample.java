package sec02.exam08;

public class ArrayCopybyForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 5};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
			//3개를 5개로 늘리는 방법
	}

  }
}
