package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Optional implements RestaurantStateAPI {
    private List<MenuItem> menuItems;

    public Optional() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(1, "Salmon", 14.99));
        menuItems.add(new MenuItem(2, "Chicken", 15.99));
    }

    @Override
    public void showMenu() {
        System.out.println("Optional Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }
}
