import java.util.Date;

public class Internet extends Connection {

	private Date endDate;
	
	public void setEndDate(Date date) {
		this.endDate = date;
	}
	
	public Date getEndDate() {
		return endDate;
	}
}
