// Kathy Moss
//Coding Assignment for Weeks 3 and 4
//Promineo Tech BE Software Dev
//Start 3/21/22
//Finish by 4/1

package com.promineotech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodingAssignmentWk3 {

	public static void main(String[] args) {
//1. Create an int array called ages with: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 90};

	// a. Programmatically subtract the first element from the last element and print
	int subtract = ages[0]-(ages[ages.length-1]);
	System.out.println("First Element - Last Element: "+subtract);

	// b. **** Add a new age to array ^^^, print result to show it's dynamic ****

	// loop to iterate through the array and calculate the average age, print
	int sumAge=0; // initially 0
	for(int i:ages) {
		sumAge=sumAge+i;
	}
	int averageAge = sumAge/ages.length;
	System.out.println("Average age is: "+averageAge); //28
	
//2. Create array of string names
	String names[]= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//	a. Loop to iterate through the array + calculate the average number of letters per name, print
	int sumNames=0;
	for(String name: names) { // for each name in names...
		sumNames=sumNames+name.length();
	}
	System.out.println(sumNames); // Checking to see that the sum is 23, trunkates
	int averageNames = sumNames/names.length; // 23/6=3.833
	System.out.println("The average of names: "+averageNames);
	
//	b. Loop through array again, concatenate all the names together, separated by spaces, print
	for(String name: names) { 
		System.out.print(name + " ");
	}
	System.out.println(); // adds line because I couldn't see the 3
//3. How do you access the last element of any array?	
//	array[array.length-1]
//  array at the end of the array's length, - 1 because array idx starts at 0
	
//4. How do you access the first element of any array?
// array[0]
	
//5. Create new array of int called nameLengths
	//loop over the previously created names array
	//add the length of each name to nameLengths array
int nameLengths[]=new int[6];
	for(int i = 0; i<names.length;i++) {
//		 int nameLengths[] = new int[names.length];
		 nameLengths[i]=names[i].length();


	}
	System.out.println(Arrays.toString(nameLengths));
	
int sumLengths = 0;
//6. Loop to iterate over the nameLengths array, calculate the sum of all the elements in the array, print
	for(int lengths:nameLengths) {
		sumLengths=sumLengths+lengths;
	}
	System.out.println("The sum of the lengths of names is "+sumLengths); //23 again
	
//7. Method to multiply word passed in
	String word = "Bingus";
	int n = 3;
System.out.println(multString(word,n));

//8. Firstname Lastname
String firstName = "Elena";
String lastName = "Cherenkov";
System.out.println(fullName(firstName, lastName));

//9. >100?
int[] intArr= {20,45};
System.out.println(gr100(intArr));

//10. take a double array, return avg of all elements in array
	double[] dbArray = {7,7,7,6,5,4,3};
	System.out.println("Array to get average from "+Arrays.toString(dbArray)); 
	System.out.println("Average in the array "+"is "+Average(dbArray)); //39/7 = 5.57142...

//11. checks if avg of arr1 > avg of arr2
	double arr1[]= {20,30,40};
	double arr2[]= {2,3,4};
	
	System.out.println("Is array1 larger than array2? "+firstAvgLarger(arr1,arr2));

	
//12. if moneyInPocket > 10.50 and isHotOutside = true, return true to 
	boolean isHotOutside = false;
	double moneyInPocket  = 10.77;
System.out.println("Buy a drink today? "+willBuyDrink(isHotOutside,moneyInPocket));
	
//13. my method checks how many players and chooses a game mode
	int numPlayers=0;
	System.out.println("Game Mode: "+setGameMode(numPlayers));
	} // end main
	



// *** Begin Methods Here ***
//9. Method takes a string word, an int n in 
public static String multString(String word, int n) {
	String word1="";
	for (int i=0;i<n;i++) {// returns the word concatenated to itself an n amount of  times
		word1+=word;
	}
	return word1;
}

//8. Method takes two Strings, firstName and lastName; returns a full name (two strings separated by a space)
public static String fullName(String firstName, String lastName) {
	return(firstName + " " + lastName);
}

//9. Method that takes an array of int,
//returns true if the sum of all the ints in the array is > 100
public static boolean gr100(int[] intArr) {
	int sum = 0;
	for(int i:intArr) {
		sum+=i;
	}
	if (sum>100) 
		return true;
	
	return false;

}

//10. Method takes an array of double, returns average of all elements in array
public static double Average(double[] dbArray) {
	double sum = 0;
	for(int i = 0; i<dbArray.length;i++) {
		sum+=dbArray[i];
		
	}
	double average = sum/dbArray.length;
	return average;
}

//11. Method takes two arrays of double, returns true if average of elements in 1st arr > avg elements of 2nd
public static boolean firstAvgLarger(double[] arr1, double[] arr2) {
	double sum1=0;
	double sum2=0;
	for(int i = 0; i<arr1.length;i++) {
		sum1+=arr1[i];
	}
	double avg1 = sum1/arr1.length;
	
	for(int j = 0; j<arr1.length;j++) {
		sum2+=arr2[j];
	}
	double avg2 = sum2/arr2.length;
	
	if(avg1>avg2) { 
		return true;
	}else {
		return false;
	}
	
}

//12. Method that returns true if hot outside and moneyInPocket>10.50
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside==true&&moneyInPocket>10.50) {
		return true;
	}else {
		return false;
	}
}

//13. Create method of your own that solves a problem, in comments write what method does/why you created it
// Method that sets different game modes depending on # of players
public static String setGameMode(int numPlayers) {
	String gameMode;
	switch(numPlayers) {
	// Game mode: Ones if players = 1
	case 1: gameMode = "Ones";
	break;
	// Game mode: Doubles if players = 2
	case 2: gameMode = "Doubles";
	break;
	// Game mode: Standard if players = 3
	case 3: gameMode = "Standard";
	break;
	// Game mode: Chaos if players = 4
	case 4: gameMode = "Chaos";
	break;
	// Otherwise: "Too many players or not enough, select a viable option."
	default: gameMode = "Too many or not enough players, select a viable option";
}
	return gameMode;
}
} // end full program


