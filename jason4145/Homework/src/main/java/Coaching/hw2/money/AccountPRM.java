package Coaching.hw2.money;


// 사용시 ProtectedMoney class와 동일 패키지에 있어야 함.
public class AccountPRM {
	
	private ProtectedMoney balance;
	
	public ProtectedMoney deposit(ProtectedMoney money){
		balance.amount += money.amount;
		return balance;
	}

	public ProtectedMoney withdraw(ProtectedMoney money){
		balance.amount -= money.amount;
		return balance;
	}
	
}
