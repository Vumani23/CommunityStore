package za.ac.cput.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.store.domain.Item;
import za.ac.cput.store.factory.ItemFactory;
import za.ac.cput.store.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/create")
    public ResponseEntity<Item> create(@RequestBody Item item) {
        Item newItem = ItemFactory.createItem(item.getName(), item.getDescription(), item.getPrice());
        if (newItem == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(itemService.save(newItem));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Item>> getAll() {
        return ResponseEntity.ok(itemService.getAll());
    }
}