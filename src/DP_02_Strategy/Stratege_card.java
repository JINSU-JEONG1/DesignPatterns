package DP_02_Strategy;

import java.util.ArrayList;
import java.util.List;

//클라이언트 - 전략 제공/설정
public class Stratege_card {
	public static void main(String[] args) {
        // 쇼핑카트 전략 컨텍스트 등록
        ShoppingCart cart = new ShoppingCart();

        // 쇼핑 물품
        Item A = new Item("맥북 프로", 10000);
        Item B = new Item("플레이스테이션", 30000);
        cart.addItem(A);
        cart.addItem(B);

        // LUNACard로 결제 전략 실행
        cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo")); // 4000원 paid using LUNACard.

        // KAKAOBank로 결제 전략 실행
        cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789", "123", "12/01")); // 4000원 paid using KAKAOCard.
    }

}




	//전략 - 추상화된 알고리즘
	interface PaymentStrategy {
		void pay(int amount);
	}
	
	// 세부구현된 카카오카드 전략 알고리즘
	class KAKAOCardStrategy implements PaymentStrategy {
		private String name;
		private String cardNumber;
		private String cvv;
		private String dateOfExpiry;
	
		public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
			this.name = nm;
			this.cardNumber = ccNum;
			this.cvv = cvv;
			this.dateOfExpiry = expiryDate;
		}
	
		@Override
		public void pay(int amount) {
		    System.out.println(amount + "원 paid using KAKAOCard.");
		}
	}
	
	// 세부구현된 루나카드 전략 알고리즘
	class LUNACardStrategy implements PaymentStrategy {
		private String emailId;
		private String password;
	
		public LUNACardStrategy(String email, String pwd) {
		    this.emailId = email;
		    this.password = pwd;
		}
		
		@Override
		public void pay(int amount) {
		    System.out.println(amount + "원 paid using LUNACard.");
		}
	}

	//컨텍스트 - 전략을 등록하고 실행
	class ShoppingCart {
		List<Item> items;
	
		public ShoppingCart() {
			this.items = new ArrayList<Item>();
		}
	
		public void addItem(Item item) {
		    this.items.add(item);
		}
			
		// 전략을 매개변수로 받아서 바로바로 전략을 실행
		// 메소드의 입력값으로 객체를할당, 각 전략에 따라 초기화하는 생성자매개변수 갯수가 달라도 상관없어짐 
		public void pay(PaymentStrategy paymentMethod) {
		    int amount = 0;
		    for (Item item : items) {
		        amount += item.price;
		    }
		    paymentMethod.pay(amount);
		}
	}

	class Item {
	    public String name;
	    public int price;
	
	    public Item(String name, int cost) {
	        this.name = name;
	        this.price = cost;
	    }
	}