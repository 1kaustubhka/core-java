package assignmentThree;

public class FixedDepositAcc extends Account{

	float rate;

	public FixedDepositAcc(int accNo, int bal, int minBal, String type) {
		super(accNo, bal, minBal, type);
		this.rate = (float) 9.8;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public void calInterest() {
		// TODO Auto-generated method stub
		setBal((int) (getBal()+(getBal()*(getRate()/100))));
	}
}
