package main.animals;


//Whenever we implement "Comparable", we must define its abstract method as well "compareTo"

public class Pig implements Comparable <Pig>{

	// CREATE the field "name" which is a String
	private String name;
	// CREATE the field "status" which is a String
	private String status;

	// CREATE the constructor
	public Pig(String name, String status) {
		this.name = name;
		this.status = status;

	}
	
	
	// Create getter and setter for name and status
	public String getName(){
		return name;
	}

	public String getStatus(){
		return status;
	}
	

	@Override
	public int compareTo(Pig o) {
		//put logic that compares it and sort it via asc - here we override the default functionality and we need to define how we want it to SORT in ascending order
		System.out.println(	"we have reached the compareTo method: ");

		// 1 (positive number)  - ascending order
		// -1 (negative number) - descending order
		// 0  (zero) - does not do any sorting

		// need to call the 'compare' method
		//compare this to that  (compare name to name)
		//

		//	return 	o.name.compareTo(this.name);


/*		if (this.getName() > that.getName()) {
           return -1;
     	 } else if (this.name.equals(that.name)) {
          return 0;
     	 } else{
           return  1;
           }*/
	return 0;

	}
}
