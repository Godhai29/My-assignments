package method.override;

public class AxisBank extends BankInfo {
	public void deposit() {
		int depo=6000;
		System.out.println("Deposit amount is "+depo);
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
	}
}
