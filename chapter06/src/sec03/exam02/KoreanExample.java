package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("김경민","980502-112233");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean a = new Korean("배유미","930318-112233");
		System.out.println("a.name : " + a.name);
		System.out.println("a.ssn : " + a.ssn);
	}

}
