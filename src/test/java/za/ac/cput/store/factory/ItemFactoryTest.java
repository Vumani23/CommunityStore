package za.ac.cput.store.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.store.domain.Item;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

    @Test
    void testCreateItemSuccess() {
        Item item = ItemFactory.createItem("Bread", "Whole wheat loaf", 18.50);
        assertNotNull(item);
        assertNotNull(item.getId());
        assertEquals("Bread", item.getName());
    }

    @Test
    void testCreateItemFail() {
        Item item = ItemFactory.createItem("", "Invalid item", -5.0);
        assertNull(item);
    }
}