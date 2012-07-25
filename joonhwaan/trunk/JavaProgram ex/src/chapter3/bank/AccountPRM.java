package chapter3.bank;

import chapter3.bank.money.ProtectedMoney;


public class AccountPRM {
	private ProtectedMoney balance;
	
	public ProtectedMoney deposit(ProtectedMoney money){
		balance.amount += money.amount;
		return balance;
		
	}
	
	
}
