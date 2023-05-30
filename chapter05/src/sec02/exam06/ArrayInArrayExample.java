package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println("");
		//englishScores[0].length = 2; 이건 틀림
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);	
		

	}

}
		System.out.println(englishScores.length); // 이건 층수가 몇개냐
		System.out.println(englishScores[0].length); // 1층에 몇개냐
		System.out.println(englishScores[1].length);  // 2층에 몇개냐 이거임
		// 1층의 3번째 방에 50을 넣어라
		//englishScores[0][2] = 50;
		//System.out.println(englishScores[0][2]);
		// 1층은 방이 2개 밖에없으니 3번째 방은 없음 컴파일 오류
		//배열은 공간이 결정이 되면 갯수를 늘릴수가 없음
		//인덱스 i나오면 0부터 0이어도 1층임   //사이즈 길이는 1부터 
 	}
}
