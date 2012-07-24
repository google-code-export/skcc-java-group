package Coaching.hw2.bank;

import Coaching.hw2.money.PrivateMoney;

// 사용불가.
public class AccountPVM {
	
	private PrivateMoney balance;
	
	public PrivateMoney deposit(PrivateMoney money){
//		balance.amount += money.amount;		// balance, money�� amount Ÿ���� private ������� ��� �Ұ�. 
		return balance;
	}
	
}
