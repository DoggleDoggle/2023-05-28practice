package sec1.exam02;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.powerOn();

		int result1 = cal.plus(30, 40);
		System.out.println(result1);

		byte x = 10;
		byte y = 10;

		double result2 = cal.divide(x, y);
		// double 이라는 데이터타입
		// result2 변수에 cal.divide(x,y)의 번지를 저장
		// divide 에 10,10을 인자로 전달한다
		// divide 메소드 안에 각각 int 10 ,int 10 이 들어가고
		//

		System.out.println(result2);
		System.out.println(result2 + result2);

		cal.powerOff();
	}

}
