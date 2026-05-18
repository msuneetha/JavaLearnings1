package src.com.semanticsquare.basics;

public class CustomerOrder {
	// Variables
	private static int orderNumber = 1000;
	static double seniorDiscount = 2.0;
	boolean seniorCitizen = false;
	double orderAmount = 0.0;
	boolean largeDrink;

	int foodChoice;
	int drinkChoice;
	int dessertChoice;
	String couponCode;


	public CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode,  boolean seniorCitizen) {

		this.foodChoice = foodChoice;
		this.drinkChoice = drinkChoice;
		this.largeDrink = largeDrink;
		this.dessertChoice = dessertChoice;
		this.couponCode = couponCode;
		this.seniorCitizen = seniorCitizen;

		orderNumber = orderNumber + 1;

	}
	public CustomerOrder(int foodChoice, int drinkChoice, boolean largeDrink, int dessertChoice, String couponCode) {
		this(foodChoice, drinkChoice, largeDrink, dessertChoice,  couponCode, false);
	}

	public static int getOrderNo() {
		return orderNumber;
	}


	public double generateOrderBill() {

		orderAmount  = Menu.getMenuItemPrice(foodChoice, largeDrink);
		orderAmount  += Menu.getMenuItemPrice(drinkChoice, largeDrink);
		orderAmount  += Menu.getMenuItemPrice(dessertChoice, largeDrink);

		if(orderAmount > 10.0) {

			orderAmount -= Menu.applyCoupon(couponCode);

		}

		//double price = Menu.price;

		if(seniorCitizen) {

			orderAmount =  orderAmount - seniorDiscount;

		}		

		return orderAmount; 

	}

}