package hw2.bank;

import hw2.money.PrivateMoney;


public class AccountPVM {
	
	private PrivateMoney balance;
	
	public PrivateMoney deposit(PrivateMoney money){
//		balance.amount += money.amount;		// balance, money의 amount 타입이 private 형식으로 사용 불가. 
		return balance;
	}
	
}
