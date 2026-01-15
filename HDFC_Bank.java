package bankATM_UsingInterface;

public class HDFC_Bank  implements ATM_Powai, ATM_Thane, ATM_Bhandup{
	
	int totalbal = 0;

	@Override
	public void deposit(int amt1) {
		if (amt1 > 0) {
			totalbal += amt1;
			System.out.println(amt1 + " Deposit Successfully");
		}

		else {
			System.out.println("Transcation Failed");
		}

	}

	@Override
	public void withdraw(int amt2) {
		if (amt2 <= totalbal) {
			totalbal -= amt2;
			System.out.println(amt2 + " Widthdraw Successfully");

		}

		else if (amt2 < 0) {
			System.out.println("Amount is not Valid ");

		}

		else if (amt2 > totalbal) {
			System.out.println("Not Enough Balance Please enter valid amount");

		}
		
	}

	@Override
	public void checkbal() {
		System.out.println("Avaiable Balanace is Rs." + totalbal);
	}

}
