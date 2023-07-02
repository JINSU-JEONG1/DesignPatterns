package DP_01_SingleTon;

class BillPughSolution {
	/**
	 * 멀티쓰레드 Safe, Laze Loading(나중에 객체생성가능)
	 * 클래스 안에 내부클래스를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한방법
	 * 단점 : 클라이어느가 임의로 싱글톤을 파괴할수있음(Reflection API, 직렬화 역직렬화를 통해) 
	 * !!뭔소린지 이해안댐!!
	 * @author jinsu
	 *
	 */
}

class Singleton{
	
	private Singleton() {}
	
	/**
	 * static 내부 클래스를 이용, Holder 로 만들어 
	 * 클래스가 메모리에 로드되지 않고 getInstance 메서드가 호출되어야 로드됨
	 */
	private static class SingleInstanceHoler{
		private static final Singleton Instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingleInstanceHoler.Instance;
	}
}