package comCerucciDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comCerucciDemo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	
}
