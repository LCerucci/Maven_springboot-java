package comCerucciDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comCerucciDemo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
