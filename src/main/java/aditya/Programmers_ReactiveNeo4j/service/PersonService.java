package aditya.Programmers_ReactiveNeo4j.service;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.ReactiveNeo4jClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class PersonService {

	private final PersonRepository personRepository;
	private final ReactiveNeo4jClient client;

	public Mono<Person> createOne(String name) {
		client.query("CREATE (p:Person {name:`$name`}) RETURN p")
			.bind(name)
			.to("name");
		return null;
	}


	public Mono<Person> createPerson(String name) {
		return this.personRepository.createPerson(name);
	}
}
