package comCerucciDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comCerucciDemo.entities.Payment;

public interface PaymentInterface extends JpaRepository<Payment, Long>{

}
