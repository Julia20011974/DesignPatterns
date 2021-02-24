import java.util.Date;

public class Calls extends Connection {

	private String recvPhone;
	private Date endDate;
	
	public void setRecvPhone(String phone) {
		this.recvPhone = phone;
	}
	
	public void setEndDate(Date date) {
		this.endDate = date;
	}
	
	public String getRecvPhone() {
		return this.recvPhone;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}
}
