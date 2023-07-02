package DP_01_SingleTon;

public class Enum {
	/**
	 * enum은 애초에 멤버를 만들때 private로 만들고 한번만 초기화 하기 때문에 thread safe함.
	 * enum 내에서 상수,변수,메서드등을 선언해사용가능하기때문에 이를이용함
	 * Reflection을 통한 공격에도 안전
	 * 단점: 싱글톤 클래스를 멀티톤(일반적인 클래스)로 마이그레이션 해야할때 처음부터 코드를 다시 짜야 되는 단점이 존재한다. (개발 스펙은 언제어디서 변경 될수 있기 때문에)
	 * !!뭔소린지 이해안댐!!
	 * @author jinsu
	 *
	 */
}

enum SingletonEnum {
    INSTANCE;

    private final Client dbClient;
	
    SingletonEnum() {
        dbClient = Database.getClient();
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public Client getClient() {
        return dbClient;
    }
}

public class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.getInstance();
        singleton.getClient();
    }
}