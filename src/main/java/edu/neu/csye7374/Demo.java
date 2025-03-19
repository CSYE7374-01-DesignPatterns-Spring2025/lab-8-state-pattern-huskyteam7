package edu.neu.csye7374;

public class Demo {
    public static void demo() {
        Restaurant restaurant = new Restaurant();

        System.out.println("Displaying Lunch Menu:");
        restaurant.displayMenu();

        System.out.println("\nSwitching to Dinner Menu:");
        restaurant.switchToDinner();
        restaurant.displayMenu();

        System.out.println("\nSwitching to Optional Menu:");
        restaurant.switchToOptional();
        restaurant.displayMenu();

        System.out.println("\nSwitching to Breakfast Menu:");
        restaurant.switchToBreakfast();
        restaurant.displayMenu();

        System.out.println("\nSwitching to Happy Hour Menu:");
        restaurant.switchToHappyHour();
        restaurant.displayMenu();
    }
    
}
