package comCerucciDemo;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import comCerucciDemo.entities.User;
import comCerucciDemo.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "lucass", "lucass@gmail.com", "99999999", "12345678");
		User u2 = new User(null, "luc", "las@gmail.com", "99949999", "123456789");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
