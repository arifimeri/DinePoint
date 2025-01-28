package org.example.dinepoint.repositories;

import org.example.dinepoint.models.Category;
import org.example.dinepoint.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findAllByName(String name);
    List<MenuItem> findAllByCategory(Category category);
    List<MenuItem> findAllByPrice(BigDecimal price);
}
