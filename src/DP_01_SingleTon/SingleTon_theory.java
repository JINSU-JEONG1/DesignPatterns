package DP_01_SingleTon;

/** Sington Pattern*/
public class SingleTon_theory {
	/**
	 * 싱글톤 패턴이란 단 하나의 유일한 객체를 만들기 위해 존재
	 * 객체가 리소스를 많이 차지하는 역할을 하는 무거운 클래스일때 적합(메모리 절약을 위해 )
	 * EX) DB 연결모듈,  네트워크 통신, 로그 기록 객체
	 */
	
	/**
	 *  1. Eager Initialization
	 *	2. Static block initialization
	 *	3. Lazy initialization
	 *	4. Thread safe initialization
	 *	5. Double-Checked Locking
	 *	6. Bill Pugh Solution
	 *	7. Enum 
	 *	현시점에선 6,7 사용
	 */
	
	/**
	 * 싱글톤 패턴의 단점
	 * 1. 모듈간 의존성이 높아진다
	 * 		- 하나의 싱글톤 클래스를 여러모듈들이 공유. 싱글톤 변경시 모듈수정 필요
	 * 2. SOLID 위반
	 * 2. TDD 단위테스트 힘듬4
	 * 		- 테스트시 매번 인스턴스 초기화필요
	 */
	
}
