package main.animals;


public class Pig {

	// CREATE the field "name" which is a String
	private String name;
	// CREATE the field "status" which is a String
	private String status;

	public Pig(String name, String status) {
		this.name = name;
		this.status = status;
		// CREATE the constructor
	}
	
	
	// Create getter and setter for name and status
	public String getName(){
		return name;
	}

	public String getStatus(){
		return status;
	}

	public void setName(){
		this.name = name;
	}

	public void setStatus(){
		this.status = status;
	}
}
