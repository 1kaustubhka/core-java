package assignmentTwo;

public class CurrentAcc  extends Account {
	float rate;

	public CurrentAcc(int accno2, int amount2) {
		super(accno2, amount2);
		this.rate = (float) 5.5;
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
