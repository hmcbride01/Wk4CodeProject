package codeProject;

public class CodeProjectAssignment {
	
	public static double[] array2;
	public static int[] array;

	public static void main (String[] args) {
		
		//Create array of integer called ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Programmatically subtract the value
		int result = ages[ages.length - 1] - ages[0];
		   System.out.println(result);
	
		//Create new array with 9 elements
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};
		
		//Repeat the subtraction
		int result2 = ages2[ages2.length - 1] - ages2[0];
		   System.out.println(result2);
		
		//Loop to iterate through the array to calculate the average
		   int sum = 0;
		   for (int age : ages2) {
			   sum += age;
			   
	
		   double average = (double) sum / ages2.length;
		   System.out.println(average);
	
	
		//Create array string names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Use a loop to iterate
		int totalLetters = 0; {
		for (String name : names) {
			totalLetters += name.length();
		}	
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);
		}
		//Create loop to concatenate all names together
		String concatenatedNames = ""; {
			for (String name : names) {
				concatenatedNames += name + " ";
		}
			System.out.println(concatenatedNames.trim()); 
			
			//How do you access the last element of any array?
				//Access the last element using array[array.length -1].
			
			//How do you access the first element of an array?
				//Access the first element using array[0].
			
			//Create new array nameLenths
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
		
			//Write a loop to iterate over nameLengths
		
			int sumOfNameLengths = 0; 
			for (int length : nameLengths) { 
				sumOfNameLengths += length; 
				} 
			System.out.println(sumOfNameLengths);
		}	
    }
}
			//Writ a method that takes a String, word and an integer.
		public static String repeatWord(String word, int n) {
			StringBuilder repeatedWord = new StringBuilder();
			for (int i = 0; i < n; i++) {
		}
		return repeatedWord.toString();
	 }

		//Write method with two strings
			
		public static String getFullName(String firstName, String lastName) {
			return firstName + " " + lastName;
			
		}
		//Write method with two array of integer and return
		public static boolean isSumGreaterThan100(int[] array0 ) {
			int sum = 0;
			for (int num: array) {
				sum += num;
			}
			return sum > 100;
		}
		//Write a method that takes an array double returns average of elements
		public static double getAverage(double[] array) {
			double sum = 0;
			for (double num : array) {
				sum += num;
			}
			return sum / array.length;
		}	
		
		//Write a method that takes two arrays returns true if aver of elements is in the first array
		public static boolean isFirstArrayAverageGreater(double[] array1, double[] array) {
			double average1 = getAverage(array1);
			double average2 = getAverage(array2);
			return average1 > average2;
			
		}
		
		//Write a method called willBuyDrink
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
		}
		
		//Create a method of my own. This method checks if a string reads the same backward and forward//
		public static boolean isPalindrome(String str) {
			String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
			int length = cleanedString.length();
			for(int i = 0; i < length / 2; i++) {
				if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
					return false;
				}
			}
					return true;
		
	}
}
