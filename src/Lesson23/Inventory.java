package Lesson23;

import java.util.ArrayList;
import java.util.List;


class Inventory {
    private List<Shoe> shoes;

    public Inventory() {
        shoes = new ArrayList<>();
    }

    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    public List<Shoe> search(String brand, Integer size, String color) {
        List<Shoe> results = new ArrayList<>();
        for (Shoe shoe : shoes) {
            boolean matches = true;
            if (brand != null && !shoe.getBrand().equalsIgnoreCase(brand)) {
                matches = false;
            }
            if (size != null && shoe.getSize() != size) {
                matches = false;
            }
            if (color != null && !shoe.getColor().equalsIgnoreCase(color)) {
                matches = false;
            }
            if (matches) {
                results.add(shoe);
            }
        }
        return results;
    }
}

