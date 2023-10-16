package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 0;  //this IS NOT FOR cycling through array
	private int numericId;
	private	String truckName;
	private String foodType;
	private int rating;
	
	//make no arg constructor
	public FoodTruck(){
		
	}
	
	//make constructor with args
	public FoodTruck(int numericId, String truckName, String foodType, int rating){
		this.numericId = numericId;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	//Add getters and setters
	public static int getNextTruckId() {
		return nextTruckId;
	}
	
	public static void setNextTruckId( ) {
		nextTruckId++;
//		FoodTruck.nextTruckId = nextTruckId;
	}
	
	public int getNumericId() {
		return numericId;
	}
	
	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}
	
	public String getTruckName() {
		return truckName;
	}
	
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	
	
	
	//to the toString method for all your test fields
	@Override
	public String toString() {
		return "FoodTruck Array Instance [numericId=" + numericId + ", truckName=" + truckName + ", foodType=" + foodType + ", rating="
				+ rating + "]";
	}


}
