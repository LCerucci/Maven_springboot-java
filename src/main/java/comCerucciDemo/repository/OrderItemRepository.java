package comCerucciDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comCerucciDemo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
