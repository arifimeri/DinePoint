package org.example.dinepoint.controllers;

import org.example.dinepoint.models.Category;
import org.example.dinepoint.models.MenuItem;
import org.example.dinepoint.services.MenuItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
    private MenuItemService menuItemService;

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItem> getMenuItemById(@PathVariable Long id){
        Optional<MenuItem> menuItem = menuItemService.getMenuItemById(id);
        return menuItem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/category/{category}")
    public List<MenuItem> getMenuItemsByCategory(@PathVariable Category category) {
        return menuItemService.getMenuItemsByCategory(category);
    }

    @GetMapping("/name/{name}")
    public List<MenuItem> getMenuItemsByName(@PathVariable String name) {
        return menuItemService.getMenuItemsByName(name);
    }

    @GetMapping("/price/{price}")
    public List<MenuItem> getMenuItemsByPrice(@PathVariable BigDecimal price) {
        return menuItemService.getMenuItemsByPrice(price);
    }

    @PostMapping
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.saveMenuItem(menuItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenuItem> updateMenuItem(@PathVariable Long id, @RequestBody MenuItem menuItem) {
        if (menuItemService.getMenuItemById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
//        menuItem.setId(id);
        return ResponseEntity.ok(menuItemService.saveMenuItem(menuItem));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Long id) {
        if (menuItemService.getMenuItemById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        menuItemService.deleteMenuItem(id);
        return ResponseEntity.noContent().build();
    }
}
