package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	int maxFleetSize = 5;
	FoodTruck[] fleet = new FoodTruck[maxFleetSize];
	Scanner keyboardInput = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		
		FoodTruckApp fta = new FoodTruckApp();
		fta.collectTruckInfo();
		fta.postEntryMenu();
		
//		String someJunk = fleet[0].toString;
//		
//		System.out.println( fleet[0].toString() );   //ask why you can not access array elements here
//		System.out.println( fleet[1].toString()  );
//		System.out.println( fleet[2].toString()  );
//		System.out.println( fleet[3].toString()  );
//		System.out.println( fleet[4].toString()  );

		
		
	}
		

	public void collectTruckInfo() {
		
		int truckId;
		String truckName;
		String foodType;
		int foodTruckRating;
		
		System.out.println("you are being prompted to enter your rating");
		System.out.println("of a minimum of one food truck and a maximum of 5 food trucks");
		
		for (int i = 0 ; i < 5 ; i++) {
			int displayedNumber = i +1;
			System.out.println("please enter truck #" + displayedNumber + " informaton:");
			
			System.out.println("what is the truck name? OR your can type quit to Quit");
			truckName = keyboardInput.nextLine();
				if ( truckName.equals("quit") || truckName.equals("QUIT") || truckName.equals("Quit")) {
					System.out.println("exiting out of the enter truck loop now, with " + FoodTruck.getNextTruckId() + " entered into DB");
					break;
				}
			truckId = FoodTruck.getNextTruckId();
			
			System.out.println("what is this truck's food genre/type?");
			foodType = keyboardInput.nextLine();
			
			System.out.println("what is this truck's food rating out in a ranking from 0 to 5");
			foodTruckRating = keyboardInput.nextInt();
			keyboardInput.nextLine(); //this clears the scanner cache after not using the line
			
			
			fleet[i] = new FoodTruck( truckId, truckName, foodType, foodTruckRating ); 
			FoodTruck.setNextTruckId();
			
		}
		
	}

	
	public void postEntryMenu() {
		int interogrationNumber;
		Scanner keyboardTwoInput = new Scanner(System.in);
		int interogatingRating = 0;
		int interogatedTruckIndexNumber = 0;
		int summationToDivide = 0;
		
		while (true) {
			System.out.println("\n\nPost Interaction Options:\n1)List All Food Trucks\n2)Display average rating of food trucks\n3)Display highest Ranked food Truck\n4)quit program");
			System.out.println("enter numeric vaule from menu options to enter your next processing step:");
			
			interogrationNumber = keyboardTwoInput.nextInt();
			System.out.println(interogrationNumber);
//			
//			System.out.println(interogrationNumber);
//			keyboardTwoInput.close();
//			break;
			
			//LISTS OUT ALL FOOD TRUCKS IN ARRAY
			if (interogrationNumber == 1) {
				System.out.println("option #1 Selected - Listing all existing food trucks");
				for (int i = 0 ; i < FoodTruck.getNextTruckId() ; i++) {
					System.out.println( fleet[i].toString() );
				}
			}
			//AVERAGE RATING OF FOOD TRUCKS
			else if (interogrationNumber == 2) {
				System.out.println("you selected 2 - See the average rating of food trucks");
				
				for (int i = 0 ; i < FoodTruck.getNextTruckId() ; i++) {
					summationToDivide += fleet[i].getRating();
				}
				
					summationToDivide = (summationToDivide/FoodTruck.getNextTruckId() );
				System.out.println("your average food rating is: " + summationToDivide + " points out of 5");
				
			}
			//PRINT OUT LATEST HIGHEST RANKING FOOD TRUCK
			else if (interogrationNumber == 3) {
				System.out.println("option #3 Selected - Display the highest-rated food truck");
				
				for (int i = 0 ; i < FoodTruck.getNextTruckId() ; i++) {
					if ( fleet[i].getRating() > interogatingRating ) {
						interogatingRating = fleet[i].getRating();
						interogatedTruckIndexNumber = i;
					}
					
				}
				System.out.println("highest ranked truck is " + fleet[interogatedTruckIndexNumber].toString());
				
			}
			//END THE PROGRAM
			else if (interogrationNumber == 4) {
				System.out.println("option #4 Selected - application is now terminating, have a good day");
				keyboardTwoInput.close();
				keyboardInput.close();
				break;
			} 
			//ERROR TO CONSOLE SINCE ENTRY WAS NOT IN RANGE
			else {
				System.err.println("you have not selected a number within range");
			}
			
//			System.out.println( fleet[0].toString() );
//			System.out.println( fleet[1].toString()  );
//			System.out.println( fleet[2].toString()  );
//			System.out.println( fleet[3].toString()  );
//			System.out.println( fleet[4].toString()  );
		}
		

	
	}

}
