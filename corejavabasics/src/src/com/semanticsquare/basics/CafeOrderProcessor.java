package src.com.semanticsquare.basics;

public class CafeOrderProcessor {

	String Name = "Suneetha cafe";

	

	public static void main(String[] args) {
	
	
	CustomerOrder order1 = new CustomerOrder(1,8,true, 9, "HAPPYHOUR");
	
	double orderAmount = order1.generateOrderBill();
	
	System.out.println("orderNumber: " + CustomerOrder.getOrderNo());
	System.out.println("Total Amount: " + orderAmount);


	CustomerOrder order2 = new CustomerOrder(1,8,false, 9, "HAPPYHOUR", true);	
	orderAmount  = order2.generateOrderBill();

	System.out.println("orderNumber: " + CustomerOrder.getOrderNo());
	System.out.println("Total Amount: " + orderAmount);



	}

}