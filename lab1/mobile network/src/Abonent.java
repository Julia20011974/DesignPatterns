
public class Abonent {
	
	private String phone;
	private double balance;
	private Tariff tariff;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public Tariff getTariff() {
		return this.tariff;
	}
	 
}
