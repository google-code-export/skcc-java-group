package hw2.money;



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
