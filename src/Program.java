
public class Program {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = 0;
		
		try {
			result = Calculator.add(3,4);
			System.out.printf("add: %d\n", result);
			result = Calculator.sub(3,4);
		} catch(천을_넘는_예외 e) { //에러 특화
			System.out.println("특화된 처리");
		} catch(Exception e) { //나머지 처리
			System.out.println("음수 처리");
		} finally { //모든 예외가 가지고 있어야하는 메세지.
			System.out.println("입력 값에 오류가 있습니다.");
		}
		System.out.printf("sub: %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi: %d\n", result);
		result = Calculator.div(3,4);
		System.out.printf("divide: %d\n", result);
	}
}
