package edu.neu.csye7374;
import java.util.ArrayList;
import java.util.List;

public class DinnerState implements RestaurantStateAPI {
    private List<MenuItem> menuItems;

    public DinnerState() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(1, "Soup", 11.99));
        menuItems.add(new MenuItem(2, "Salad", 12.99));
        menuItems.add(new MenuItem(3, "Steak", 13.99));

    }

    @Override
    public void showMenu() {
        System.out.println("Dinner Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }
}
