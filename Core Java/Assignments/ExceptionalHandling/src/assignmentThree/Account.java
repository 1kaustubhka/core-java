package assignmentThree;

public class Account {
	protected int AccNo;
	protected int Bal;
	protected int MinBal;
	private String type;

	public Account(int accNo, int bal, int minBal, String type) {
		super();
		AccNo = accNo;
		Bal = bal;
		MinBal = minBal;
		this.type = type;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public int getBal() {
		return Bal;
	}

	public void setBal(int bal) {
		Bal = bal;
	}

	public int getMinBal() {
		return MinBal;
	}

	public void setMinBal(int minBal) {
		MinBal = minBal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void calInterest() {
		System.out.println("Calculate Annual Interest");
	}

	public void withdraw(int am) {
		try {
			if (am > getBal()) {
				throw new InsufficientBalance();
			} else {
				setBal(getBal() - am);
				System.out.println("Withdraw Successful. New Bal: " + getBal());
			}
		} catch (InsufficientBalance ib) {
			System.out.println(ib.getMsg());
		}
	}
}
