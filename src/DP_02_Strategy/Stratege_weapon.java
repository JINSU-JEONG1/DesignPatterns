package DP_02_Strategy;

public class Stratege_weapon {
	
	public static void main(String[] args) {
        // 플레이어 손에 무기 착용 전략을 설정
        TakeWeaponStrategy hand = new TakeWeaponStrategy();

        // 플레이어가 검을 들도록 전략 설정
        hand.setWeapon(new Sword());
        hand.attack(); // "칼을 휘두르다"

        // 플레이어가 방패를 들도록 전략 변경
        hand.setWeapon(new Shield());
        hand.attack(); // "방패로 밀친다"
        
        // 플레이어가 석궁을 들도록 전략 변경
        hand.setWeapon(new CrossBow());
        hand.attack(); // "석궁을 발사하다"
    }

}


/**
 * 아래부터 예제
 * @author me
 *
 */

interface Weapon {
    void offensive();
}

class Sword implements Weapon {
    @Override
    public void offensive() {
        System.out.println("칼을 휘두르다");
    }
}

class Shield implements Weapon {
    @Override
    public void offensive() {
        System.out.println("방패로 밀친다");
    }
}

class CrossBow implements Weapon {
    @Override
    public void offensive() {
        System.out.println("석궁을 발사하다");
    }
}


//컨텍스트 - 전략을 등록하고 실행
class TakeWeaponStrategy {
 Weapon weapon;

 void setWeapon(Weapon weapon) {
     this.weapon = weapon;
 }

 void attack() {
	 weapon.offensive();
 }
}
