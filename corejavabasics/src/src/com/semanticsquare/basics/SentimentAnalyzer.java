package src.com.semanticsquare.basics;

import java.util.Arrays;

public class SentimentAnalyzer {

	public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords, String[] negOpinionWords) {

		int[] featureOpinions = new int[featureSet.length]; // output

		int index = 0;

		for (String[] feature : featureSet) {

			//int featureFound = 0;
			
		
			for (String featureVal : feature) {

				String temp = featureVal.toLowerCase();
				
			   if( review.toLowerCase().contains(temp)) {

				System.out.println("inside success");

				
				featureOpinions[index] = 1;
				
				getOpinionOnFeature(review, featureVal, posOpinionWords, negOpinionWords);
								
			     }
			
			}
			index++;		
		}	
 
		return featureOpinions;
	}

	// First invoke checkForWasPhrasePattern and 
	// if it cannot find an opinion only then invoke checkForOpinionFirstPattern




	private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {

		int opinion = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);

		if (opinion < 0) {

		  opinion  =  checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
		
		} 

		 return opinion;
		
		// your code
		
	}	

	// Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
	// Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
	// You can first look for positive opinion. If not found, only then you can look for negative opinion


	private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		int opinion = 0;
		String pattern = feature + " was ";

		// your code

		System.out.println(" feature selected was: " + feature);
		

		return opinion; 	
	}
	
	// You can first look for positive opinion. If not found, only then you can look for negative opinion

	private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
			String[] negOpinionWords) {
		// Extract sentences as feature might appear multiple times. 
		// split() takes a regular expression and "." is a special character 
		// for regular expression. So, escape it to make it work!!
		String[] sentences = review.split("\\.");
		int opinion = 0;
		
		// your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)		

		return opinion;
	}

	public static void main(String[] args) {

		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";
		
		//String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}