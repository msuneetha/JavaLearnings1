package src.com.semanticsquare.basics;

public class Menu {
	
	public static double getMenuItemPrice(int choice, boolean largeDrink) {
		
		double price;
		
	 switch (choice) {
			case 0: {price = 0.0; break;}
			case 1: {price = 12.0; break;}
			case 2: {price = 8.0; break;}
			case 3: {price = 10.0; break;}
			case 4: {price =  15.0; break;}
			case 5: {price =  7.0; break;}
			case 6: {price =  9.0; break;}
			case 7,8: {
			    if(largeDrink)
			        price =  3.0;
			    else
			        price =  4.0; 
			    break;
			}
			case 9: {price =  5.0; break;}
			case 10: {price =  6.0; break;}
			default: {price =  0.0; break;}
		}
	 return price;
	
	}

	public static double applyCoupon(String couponCode) { 
		
		double coupon;

		 switch (couponCode) {
			case "SAVE4": {coupon =  4.0; break;}
			case "HAPPYHOUR": {coupon =  5.0; break;}
			case "SPECIAL3OFF": {coupon =  3.0; break;}
			case "SUNDAY2OFF","GOODSTUDENT": {coupon =  2.0; break;}
			default:  {coupon =  0.0; break;}
		}
		 
		 return coupon;
	}

}