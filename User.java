package bankATM_UsingInterface;

public class User {

	public static void main(String[] args) {
		
		
		ATM_Powai user1 = new SBI_Bank();
		user1.checkbal();
		user1.deposit(35000);
		user1.withdraw(5000);
		user1.checkbal();
		
		System.out.println("-----");
		ATM_Thane user2 = new SBI_Bank();
		user2.checkbal();
		user2.deposit(25000);
		user2.withdraw(5000);
		user2.checkbal();
		
		System.out.println("------");
		
		ATM_Bhandup user3 = new SBI_Bank();
		user3.checkbal();
		user3.deposit(25000);
		user3.withdraw(5000);
		user3.checkbal();
		
		
		System.out.println("-----");
		ATM_Powai hdfc1 = new HDFC_Bank();
		hdfc1.checkbal();
		hdfc1.deposit(55000);
		hdfc1.withdraw(5000);
		hdfc1.checkbal();
		

	}

}
