# FoodTruckProject
This project is meant to collect Food Truck information in a business setting. Collections of Food trucks in this application has a working interface where users can enter truck a series of truck names, their numeric ranking (between 1 and 5), and their genre type category. The application has no true database, so the values collected simulate interactions with a Database.

# Description
The food truck application simulates a full fledged application where we take in values that correspond to a food truck and their genre along with their rank. After collecting these values the application has sub-menus where we are able to further process collected data such as:
1) Highest Ranking Food Truck
2) Average food Truck rating
3) Print out all food trucks with their respective information


# Technologies Used
Java, OOP, Eclipse


# Lessons Learned
Plenty of lessons learned here such as scope of variables accessibility depending on where the variables are placed such local variables not being visible to other methods. So the workaround would be to expose variables as field level variables. 

Secondly making static variables, although the variables can be called on by instance of a class explicitly and Java is able to handle this, it is best to call the static variable by the class names (as follows --> className.staticVariableOrMethod) 

Lastly, following Java Object Oriented Programming standards where we keep class members private I have learned the power of using getters and setters to overcome the inability to directly access field level members.