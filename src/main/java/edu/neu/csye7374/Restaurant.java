package edu.neu.csye7374;
public class Restaurant{
    private RestaurantStateAPI lunchState;
    private RestaurantStateAPI dinnerState;
    private RestaurantStateAPI optionalState;
    private RestaurantStateAPI currentState;

    public Restaurant() {
        this.lunchState = new LunchState();
        this.dinnerState = new DinnerState();
        this.optionalState = new Optional();
        this.currentState = lunchState;
    }

    public void setState(RestaurantStateAPI state) {
        this.currentState = state;
    }

    public void displayMenu() {
        currentState.showMenu();
    }

    public void switchToLunch() {
        setState(lunchState);
    }

    public void switchToDinner() {
        setState(dinnerState);
    }

    public void switchToOptional() {
        setState(optionalState);
    }
}
