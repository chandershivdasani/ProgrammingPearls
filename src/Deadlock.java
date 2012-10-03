
public class Deadlock {
	
	public static void main(String[] args) {
		final Account alice = new Account(1500);
		final Account bob = new Account(1000);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				alice.transfer(alice, bob, 100);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				alice.transfer(bob, alice, 100);
			}
		});
	}
}

class Account {
	
	int balance;
	int id;
	
	Account(int balance) {
		this.balance = balance;
	}
	void withdraw(int amount) {
		balance-=amount;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
	void transfer(Account from, Account to, int amount) {
		synchronized(from) {
			synchronized(to) {
				from.withdraw(amount);
				to.deposit(amount);
			}
		}
	}
}
