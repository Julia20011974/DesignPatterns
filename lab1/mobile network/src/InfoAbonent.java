import java.util.ArrayList;

public class InfoAbonent {
  
  private ArrayList<Sms> sms;
  private ArrayList<Calls> calls;
  private ArrayList<Internet> internet;
  
  public void setSms(ArrayList<Sms> sms) {
	  this.sms = sms;
  }
  
  public void setCalls(ArrayList<Calls> calls) {
	  this.calls = calls;  
  }
  
  public void setInternet(ArrayList<Internet> internet) {
	  this.internet = internet;
  }
  
  public ArrayList<Sms> getSms(){
	  return this.sms;
  }
  
  public ArrayList<Calls> getCalls(){
	  return this.calls;
  }
  
  public ArrayList<Internet> getInternet(){
	  return this.internet;
  }
  
  
}
