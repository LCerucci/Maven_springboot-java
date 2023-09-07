package comCerucciDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comCerucciDemo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{	
}
