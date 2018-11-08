package mal.art.demotournamentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
public class TournamentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournamentAppApplication.class, args);
	}
}
