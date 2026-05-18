package src.com.semanticsquare.basics;

public class BinarySearch {

	static int binSearch(int[] input, int firstIndex, int secondIndex, int searchElement) {		
	
	        if (firstIndex > secondIndex) {

			return -1;		   
		 } 

		
		int mid = (firstIndex + secondIndex) / 2;

		if (input[mid] == searchElement) {

			return mid;

		}else if (input[mid] > searchElement) {
						
			return binSearch(input, firstIndex, mid-1, searchElement);

		} else {
			
			return	binSearch(input, mid+1, secondIndex, searchElement);
		}

		
		
	} 

	public static void main(String[] args) {

	int[] input = {1,23,33,45,56,65,75,87,89};

	int elementIndex = BinarySearch.binSearch(input, 0, input.length-1, 65);
	
	System.out.println("index of the search element" + elementIndex);

	}

}