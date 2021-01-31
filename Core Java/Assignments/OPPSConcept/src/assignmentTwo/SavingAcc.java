package assignmentTwo;

public class SavingAcc extends Account{

	float rate;

	public SavingAcc(int accno, int amount) {
		super(accno,amount);
		this.rate = (float) 9.8;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public float increaseAmt()
	{
		float amt = amount*(rate/100);
		return amt+amount;
	}
}
