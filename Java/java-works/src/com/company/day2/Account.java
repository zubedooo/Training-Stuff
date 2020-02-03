package com.company.day2;

public class Account {
	int balance;
	//simulating the data is taken from Db
	public Account(int balance) {
		this.balance = balance;
	}
	public synchronized void withDraw(int amount) {
		if(amount < balance) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			balance = balance - amount;
			
			
			System.out.println("Amount Withdrawn of "+amount + " by "+
			Thread.currentThread().getName());
		}else {
			System.out.println("Sorry "+ Thread.currentThread().getName()+ ", requested amount not availaible for  :"+amount);
			System.out.println("Your current balance is only "+balance);
		}
	}

}