package sec1.exam01;

public class Korean {

	// Field 필드

	String nation; // 국가
	String name; // 이름
	String ssn; // 주민번호

	// Constructor 생성자

	void k1(String nat, String n, String s) {

		this.nation = nation; //매개변수 nation을 nation이라는 이름의 필드에 저장하라
		this.name = name;
		this.ssn = ssn;
	}

	void k(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	void print() {
		System.out.printf("---------------------------\n");
		System.out.printf("국적  이름   주민번호 \n");
		System.out.printf("%s  %s  %s\n", this.nation, this.name, this.ssn);

	}
}