

public class calc {
	private double num1;
	private double num2;
	private String opp; //for the operator
	
	public calc() {
		
	}
	public calc(double num1, double num2, String opp) {
		this.num1 = num1;
		this.num2 = num2;
		this.opp = opp;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOpp() {
		return opp;
	}
	public void setOpp(String opp) {
		this.opp = opp;
	}
 
}
