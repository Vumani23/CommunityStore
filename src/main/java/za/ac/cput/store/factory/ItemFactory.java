package za.ac.cput.store.factory;

import za.ac.cput.store.domain.Item;
import za.ac.cput.store.util.Helper;

public class ItemFactory {
    public static Item createItem(String name, String description, double price) {
        if (Helper.isNullOrEmpty(name) || price < 0) {
            return null;
        }

        String id = Helper.generateId();

        return Item.builder()
                .id(id)
                .name(name)
                .description(description)
                .price(price)
                .build();
    }
}