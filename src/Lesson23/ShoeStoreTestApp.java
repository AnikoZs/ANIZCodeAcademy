package Lesson23;

import java.util.ArrayList;
import java.util.List;


public class ShoeStoreTestApp {

        public static void main(String[] args) {
            ShoeStore store = new ShoeStore("Anikós Sko");

            store.addShoe("Nike", 42, "Sort", 899.0);
            store.addShoe("Adidas", 40, "Hvid", 799.0);
            store.addShoe("Puma", 42, "Sort", 699.0);

            List<Shoe> results = store.searchShoes("Nike", 42, null);
            for (Shoe shoe : results) {
                System.out.println(shoe);
            }
        }
}
