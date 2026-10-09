package za.ac.cput.store.service;

import za.ac.cput.store.domain.Item;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    Item save(Item item);
    Optional<Item> read(String id);
    List<Item> getAll();
    void delete(String id);
}