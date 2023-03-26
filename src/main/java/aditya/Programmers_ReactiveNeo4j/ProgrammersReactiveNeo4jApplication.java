package aditya.Programmers_ReactiveNeo4j;


import org.neo4j.driver.Driver;
import org.neo4j.springframework.data.config.EnableNeo4jAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.core.ReactiveDatabaseSelectionProvider;
import org.springframework.data.neo4j.core.transaction.ReactiveNeo4jTransactionManager;
import org.springframework.data.neo4j.repository.config.ReactiveNeo4jRepositoryConfigurationExtension;
import org.springframework.transaction.ReactiveTransactionManager;

@SpringBootApplication
@EnableNeo4jAuditing
public class ProgrammersReactiveNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammersReactiveNeo4jApplication.class, args);
	}

	@Bean(ReactiveNeo4jRepositoryConfigurationExtension.DEFAULT_TRANSACTION_MANAGER_BEAN_NAME)
	public ReactiveTransactionManager reactiveTransactionManager(
		Driver driver,
		ReactiveDatabaseSelectionProvider databaseNameProvider) {
		return new ReactiveNeo4jTransactionManager(driver, databaseNameProvider);
	}

}
