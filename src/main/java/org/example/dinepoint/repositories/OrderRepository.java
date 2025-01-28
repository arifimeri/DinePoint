package org.example.dinepoint.repositories;

import jakarta.validation.constraints.NotNull;
import org.example.dinepoint.models.Order;
import org.example.dinepoint.models.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository  extends JpaRepository<Order, Long> {
    List<Order> findAllByCostumerName(String name);
    List<Order> findAllByOrderItems(String orderItems);
    List<Order> findAllByStatus(@NotNull OrderStatus status);
}
