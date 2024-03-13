package aditya.Programmers_ReactiveNeo4j.repository;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveNeo4jRepository<Person,Long> {
	@Query("CREATE (p:Person {name:$name}) RETURN p")
	Mono<Person> createPerson(String name);
}
