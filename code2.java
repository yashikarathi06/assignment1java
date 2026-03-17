//Restaurant (Veg & Non-Veg)
class Restaurant {
    String name;

    Restaurant(String name) {
        this.name = name;
    }

    void showMenu() {
        System.out.println("Menu not available");
    }
}

class VegRestaurant extends Restaurant {
    VegRestaurant(String name) {
        super(name);
    }

    void showMenu() {
        System.out.println(name + " Veg Menu: Paneer, Dal, Roti");
    }
}

class NonVegRestaurant extends Restaurant {
    NonVegRestaurant(String name) {
        super(name);
    }

    void showMenu() {
        System.out.println(name + " Non-Veg Menu: Chicken, Fish, Egg");
    }
}

public class Main2 {
    public static void main(String[] args) {
        VegRestaurant v = new VegRestaurant("Green Hotel");
        NonVegRestaurant n = new NonVegRestaurant("Spicy Hub");

        v.showMenu();
        n.showMenu();
    }
}