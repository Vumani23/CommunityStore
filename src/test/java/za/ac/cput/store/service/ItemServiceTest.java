package za.ac.cput.store.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.store.domain.Item;
import za.ac.cput.store.factory.ItemFactory;
import za.ac.cput.store.repository.ItemRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    private ItemRepository repository;

    @InjectMocks
    private ItemServiceImpl service;

    @Test
    void testSave() {
        Item item = ItemFactory.createItem("Milk", "Dairy", 22.00);
        when(repository.save(item)).thenReturn(item);

        Item saved = service.save(item);
        assertNotNull(saved);
        verify(repository, times(1)).save(item);
    }
}