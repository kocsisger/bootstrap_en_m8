package hu.unideb.inf.BootstrapM8;

import hu.unideb.inf.BootstrapM8.model.Person;
import hu.unideb.inf.BootstrapM8.model.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class BootstrapM8ApplicationTests {

	@Autowired
	PersonRepository personRepository;

	//@Test
	void contextLoads() {
		Person p = new Person(1,
				"Gergly",
				"Kocsis",
				"kocsis@examle.com",
				"Apple123",
				false);
		personRepository.save(p);
	}

}
