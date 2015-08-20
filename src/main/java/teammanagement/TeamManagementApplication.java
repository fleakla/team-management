package teammanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import teammanagement.dataloaders.InMemoryDataLoader;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
public class TeamManagementApplication {

    @Autowired
    private InMemoryDataLoader dataLoader;

    public static void main(String[] args) {
        SpringApplication.run(TeamManagementApplication.class, args);
    }
}
