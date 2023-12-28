package main;

import main.animals.Pig;
import main.service.FileService;

import java.util.Arrays;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];

		pigNames[0]="Corkey";
		pigNames[1]="Penny";
		pigNames[2]="Bartholomew";
		pigNames[3]="Rocky";


		System.out.println("------This is PRE SORT --------");
		System.out.println("Insert the code here that will write/display the recs as is:");


		System.out.println("------This is POST SORT --ASC Order------");

		Arrays.sort(pigNames);
		for(String piggy : pigNames){
			System.out.println(getPiggy(piggy));
		}

		// SORT the pigs by name...
		
		// 1. run a for loop on the pig array
		// 2. In the for loop create an array called pig names, get the names of the pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		// 3. Sort the pig names in Ascending order
		// 4. Print the sorted names to the console

	}

	private static String getPiggy(String piggy) {
		return piggy;
	}

}
