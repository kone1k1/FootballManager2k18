package de.kone1k1.games.FootballManager2k18;

public class Bank {
	private String name;
	private int creditLimit;
	private int creditAmount;
	private int money;

	public Bank(int startMoney) {
		this.money = startMoney;
	}

	public boolean payAmount(int amount) {

		if (amount <= money) {
			money -= amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean orderCredit(int creditValue) {

		if (creditAmount + creditValue <= creditLimit) {
			creditAmount += creditValue;
			money += creditValue;
			return true;
		} else {
			return false;
		}
	}

	public boolean payOff(int repayment) {
		if (repayment <= money && repayment <= creditAmount) {
			money -= repayment;
			creditAmount -= repayment;
			return true;
		} else {
			return false;
		}

	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getMoney() {
		return money;
	}
}