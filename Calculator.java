package sec1.exam02;

public class Calculator {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;

	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		//int 10 을 double 10으로 각각 변환해주고 
		// (double)10/(double)10 의 결과값 1.0
		//을 double  result 에 대입해준다
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
