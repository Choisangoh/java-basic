
public class For02P117 {

	public static void main(String[] args) {
		// 중첩 반복문은 반복문을 반복하는 구문입니다.
		// 다중 for문이라고 불리는 이 구문은
		// for문 내부에 추가로 for문을 작성해 구성하며
		// 실행 횟수는 바깥족 반복문의 반복횟수 * 안쪽 반복문 반복횟수 입니다.
		// 굉장히 많은 분야에서 응용되고 있으므로 반드시 잘 익혀둬야 합니다.
		
		for(int j = 0; j < 3; j++) {
			// Hello Java를 3번 반복하는 구문을 작성해보세요.
			for(int i = 0; i < 3; i++) { 
				System.out.println("Hello Java");
	    	}
		}
	}	
}
//                        내가 이해한 중첩 반복문
// ex) 위에 코드에 j가 바깥쪽 반복문 이기때문에 먼저보면 0부터 시작해서 3보다 작으니까 j의 경우의수는 0,1,2
//     안쪽 반복문 i도 0부터 시작해서 3보다 작으니까 i의 경우의수는 0,1,2이므로
//     j가 0일때 i의 수는 (0,1,2) 각각 Hello Java 3번
//     j가 1일때 i의 수는 (0,1,2) 각각 Hello Java 3번
//     j가 2일때 i의 수는 (0,1,2) 각각 Hello Java 3번