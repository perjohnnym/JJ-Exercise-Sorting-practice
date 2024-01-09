package main;

import main.animals.Pig;
import main.service.FileService;

import java.util.Arrays;

public class FarmerAlBaryardInventoryApplicationTwo {

	// SORT the pigs by name...

	// 1. run a for loop on the pig array
	// 2. In the for loop create an array called pig names, get the names of the pigs using
	// the getName getter from the Pig class, save it into the pigNames string array
	// 3. Sort the pig names in Ascending order
	// 4. Print the sorted names to the console

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();

		String[] pigNames = new String[4];

		// In the for loop create an array called pig names, get the names of the pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		//we run thru the array of Pig objects and assign it to a String[] of pigNames so that we cqn later use the sort method
		System.out.println("------This is PRE SORT --------");
		int i=0;
		for(Pig piggy : pigs){
			System.out.println(pigNames[i]	= piggy.getName());
			i++;
		}


		System.out.println("------This is where the POST SORT should appear --ASC Order------");

		//when we define the @override CompareTo method, it's how we use the ".sort" method
		//Here we need to sort an array of objects "Pig" and then in the CompareTo method, define how it's to be sorted
		//However, the datatype 'String' already implements the class Comparable and has the default method "CompareTo"
		//already defined (it is sorted in lexicographically)
		//


		Arrays.sort(pigNames);

		for(String piggy : pigNames){
				System.out.println(piggy);
			}
	}

}
