package DP_02_Strategy;

public class Strategy_theory {
	/**
	 * 전략 패턴이란 실행(런타임) 중에 알고리즘 전략을 선택하여 객체 동작을 실시간으로 바뀌도록 할 수 있게 하는 행위 디자인 패턴
	 * 즉, 어떤 일을 수행하는 알고리즘이 여러가지 일때, 동작들을 미리 전략으로 정의함으로써 손쉽게 전략을 교체할 수 있는, 알고리즘 변형이 빈번하게 필요한 경우에 적합
	 */
	

	/**
	 * 전략 패턴이란
	 * 1. 동일 계열의 알고리즘군을 정의				-->	 전략 구현체로 정의
	 * 2. 각각의 알고리즘은 캡슐화					-->  인터페이스로 추상화
	 * 3. 상호교환 가능하도록 만든다				-->  composition 으로 구성
	 * 4. 클라이언트와 상관없이 독립적으로 			-->  context 수정없이
	 * 5. 알고리즘을 다양하게 변경할 수 있게한다. 	-->  메소드를 통해 객체를 실시간으로 변경
	 */
	
}