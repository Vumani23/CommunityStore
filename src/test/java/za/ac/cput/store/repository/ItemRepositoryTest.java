package za.ac.cput.store.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import za.ac.cput.store.domain.Item;
import za.ac.cput.store.factory.ItemFactory;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    void testSaveAndFindItem() {
        Item item = ItemFactory.createItem("Apple", "Fresh fruit", 5.00);
        assertNotNull(item);

        Item saved = repository.save(item);
        assertNotNull(saved);
        assertEquals(item.getId(), repository.findById(saved.getId()).orElseThrow().getId());
    }
}