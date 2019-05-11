import java.util.Scanner;

public class MyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		String productName = "";
		String productID = "";
		int transactionID = 0;
		double productPrice = 0;
		int units = 0;
		double money = 0;
		
		System.out.print("Enter product name : ");
		productName = reader.nextLine();
		System.out.print("Enter product ID : ");
		productID = reader.nextLine();
		System.out.print("Enter transaction ID : ");
		transactionID = reader.nextInt();
		System.out.print("Enter product price : $");
		productPrice = reader.nextDouble();
		System.out.print("Enter how many unit purchased : ");
		units = reader.nextInt();
		System.out.print("Enter amount of money paid : $");
		money = reader.nextDouble();

		Receipt test1 = new Receipt(productName,productID,transactionID,productPrice,units,money);
				
		System.out.println(test1);
		
		
		
	}

}

/*
Enter product name : Product XXX
Enter product ID : 123A45
Enter transaction ID : 12345
Enter product price : $2.99
Enter how many unit purchased : 60
Enter amount of money paid : $150
-------------------------------------
         My Store      
123 Abrams RD Dallas TX 75243  
      Store #5555     
Thank you for shopping with us 
     Transaction # : 12345
	Date : 08/24/2017 
 -------------------------------------
Product XXX 		 60.00  
 Unit Price: 		 $2.99 
 Sub Total : 		 179.40
 Tax (8.25%) : 		 14.80 
 Total: 		 194.20
-------------------------------------
 Cash:  		 150.00
 Change: 		 -44.20


*/