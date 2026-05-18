package src.com.semanticsquare.basics;

class BasicsDemo {
	
	int i = 25;
	int j = 50;

	
	/*public static String season(int month){
	
	String season;

	switch(month) {

	   case 1: season = "Spring";
		     break;
	   case 2: season = "Spring";
		     break;
	   case 3: season = "Spring";
		     break;
	   case 4: season = "Summer";
		     break;
	   case 5: season = "Summer";
		     break;	
	   case 6: season = "Summer";
		     break;
           case 7: season = "Rainy";
		     break;
	   case 8: season = "Rainy";
		     break;
	   case 9: season = "Rainy";
		     break;	
           case 10: season = "Winter";
		     break;
	   case 11: season = "Winter";
		     break;
	   case 12: season = "Winter";
		     break;
	   default: season = "Unknown";
		     break;

	}
	return season;
	}*/

	/*static void print() {

		System.out.println("\n hello world!!");
		System.out.print("hello!!");
		System.out.println(" ");
		System.out.println("\n hello world!!");
		System.out.println("\n hello world!!");
	}*/

	static void getReverseNumbers() {

		int[] temp ={0,1,2,3,4,5,6,7,8,9,10};
		int tempVar;

		for(var i = 0; i < temp.length / 2 ; i++) {

		  tempVar = temp[i];
		  temp[i] = temp[(temp.length - i) -1];
		  temp[(temp.length -i) -1] = tempVar;
		   
		}
		for(var i = 0; i < temp.length ; i++) {

		System.out.println(temp[i]);
		}

}
	public static void main(String[] args) {
		//print();
		//String currentMonth = season(6);
		//System.out.println("\nCurrent season is " + currentMonth);
		BasicsDemo.getReverseNumbers();
	}
         
}