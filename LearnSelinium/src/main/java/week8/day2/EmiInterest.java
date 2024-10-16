package week8.day2;

public class EmiInterest extends LearnEncapsulation{
	
	public static void main(String[] args) {
		
		LearnEncapsulation le = new LearnEncapsulation();
		le.setEmi(5000);
		System.out.println(le.getEmi());
		le.month=1;
		le.interest(200);
		System.out.println(le.getEmi());
		le.setEmi(5000);
		le.month=2;
		le.interest(300);
		System.out.println(le.getEmi());
	}
}
