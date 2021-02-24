import java.util.Date;

public abstract class Connection {

	private String sendPhone;
	private Date startDate;
	private double countData;

	public void setSendPhone(String phone) {
		 this.sendPhone = phone; 
	}
	
	public void setStartDate(Date date) {
		this.startDate = date;
	}
	
	public void setCountData(double countData) {
		this.countData = countData;
	}
	
	public String getSendPhone() {
		return this.sendPhone;
	}
	
	public Date getStartDate() {
		return this.startDate;
	}
	
	public double getCountDate() {
		return this.countData;
	}

}
