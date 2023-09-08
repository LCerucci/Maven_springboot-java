package comCerucciDemo;


import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import comCerucciDemo.entities.Category;
import comCerucciDemo.entities.Order;
import comCerucciDemo.entities.Product;
import comCerucciDemo.entities.User;
import comCerucciDemo.enumerate.OrderStatus;
import comCerucciDemo.repository.CategoryRepository;
import comCerucciDemo.repository.OrderRepository;
import comCerucciDemo.repository.ProductRepository;
import comCerucciDemo.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProductRepository pr;
	
	@Autowired
	private CategoryRepository cr;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "lucass", "lucass@gmail.com", "99999999", "12345678");
		User u2 = new User(null, "luc", "las@gmail.com", "99949999", "123456789");
		User u3 = new User(null, "ui", "aiai@gmail.com", "7070707070", "123456789");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u3);
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", "", 90.5);
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", "", 2190.0);
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", "", 1250.0);
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", "", 1200.0);
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", "", 100.99);
		
		p1.getCategory().add(cat2);
		p2.getCategory().add(cat1);
		p3.getCategory().add(cat3);
		p4.getCategory().add(cat3);
		p5.getCategory().add(cat1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		cr.saveAll(Arrays.asList(cat1, cat2, cat3));
		pr.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
	
}
