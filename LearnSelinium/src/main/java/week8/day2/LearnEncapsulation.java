package week8.day2;

public class LearnEncapsulation {
	
	private int emi;
	int month;
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public void interest(int it) {
		emi = emi + (month*it);
	}
}
