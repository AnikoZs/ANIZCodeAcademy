package Lesson23;

import java.util.ArrayList;
import java.util.List;


class ShoeStore {
    private String name;
    private Inventory inventory;

    public ShoeStore(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void addShoe(String brand, int size, String color, double price) {
        Shoe shoe = new Shoe(brand, size, color, price);
        inventory.addShoe(shoe);
    }

    public List<Shoe> searchShoes(String brand, Integer size, String color) {
        return inventory.search(brand, size, color);
    }
}
