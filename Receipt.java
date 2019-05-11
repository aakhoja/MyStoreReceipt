import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FA2017LAB1_Receipt_Khoja {
	
	String productName = "";
	String productID = "";
	int transactionID = 0;
	double productPrice = 0;
	int units = 0;
	double money = 0;
	

	
	public FA2017LAB1_Receipt_Khoja() {
		
	
	}
	
	public FA2017LAB1_Receipt_Khoja(String a, String pID, int tranID, double price, int uni, double mon) {
		
		productName = a;
		productID = pID;
		transactionID = tranID;
		productPrice = price;
		units = uni;
		money = mon;
		
	}
	
	public void setProductName(String p) {
		
		productName = p;
	}
	
	public void setProductID(String ID) {
		
		productID = ID;
	}
	
	public void setTransactionID(int tID) {
		
		transactionID = tID;
	}
	
	public void setProductPrice(double p) {
		
		productPrice = p;
	}
	
	public void setUnits(int u) {
		
		units = u;
	}
	
	public void setMoney(double m) {
		
		money = m;
	}
	
	public String getProductName() {
		
		return productName;
	}
	
	public String getProductID() {
		
		return productID;
	}
	
	public int getTransactionID() {
		
		return transactionID;
	}
	
	public double getProductPrice() {
		
		return productPrice;
	}
	
	public int getUnits() {
		
		return units;
	}
	
	public double getMoney() {
		
		return money;
	}
	
	public double getSubtotal() {
		
		return productPrice * units;
	}
	
	public double getSalesTax() {
		
		return (getSubtotal() * 0.0825);
	}
	
	public double getTotal() {
		
		return (getSubtotal() + getSalesTax());
	}
	
	public double getBalance() {
		
		return (money - getTotal());
	}
	
	public String getDashes() {
		
		return "-------------------------------------";
	}
	
	public String getIntro() {
		
		return (getDashes() + "\n" +String.format("%18s","         My Store      \n") + 
				"123 Abrams RD Dallas TX 75243  \n" +
				"      Store #5555     \n" +
				"Thank you for shopping with us \n");
	}
	
	public String toString() {
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		return ((getIntro() + "     Transaction # : " + getTransactionID() +
				"\n" + "\tDate : " + dateFormat.format(date) + " \n " + getDashes() + "\n" + String.format("%3s%-15s"," ",getProductName()) + String.format("%15d", getUnits()) + "  \n" + 
				" Unit Price: \t\t $" + df.format(getProductPrice()) + " \n" + 
				" Sub Total : \t\t " + df.format(getSubtotal()) + "\n" + 
				" Tax (8.25%) : \t\t " + df.format(getSalesTax()) + " \n" +
				" Total: \t\t " + df.format(getTotal()) + "\n" + getDashes() + "\n" +
				" Cash:  \t\t " + df.format(getMoney()) + "\n" +
				" Change: \t\t " + df.format(getBalance()) + "\n"));
		
		
	}

}
