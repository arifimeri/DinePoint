package org.example.dinepoint.services;

import org.example.dinepoint.models.Category;
import org.example.dinepoint.models.MenuItem;
import org.example.dinepoint.repositories.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public Optional<MenuItem> getMenuItemById(long id) {
        return menuItemRepository.findById(id);
    }

    public List<MenuItem> getMenuItemsByCategory(Category category){
        return  menuItemRepository.findAllByCategory(category);
    }

    public List<MenuItem> getMenuItemsByName(String name) {
        return menuItemRepository.findAllByName(name);
    }

    public List<MenuItem> getMenuItemsByPrice(BigDecimal price) {
        return menuItemRepository.findAllByPrice(price);
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }
}
