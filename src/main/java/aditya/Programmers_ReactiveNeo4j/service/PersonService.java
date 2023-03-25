package aditya.Programmers_ReactiveNeo4j.service;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.repository.PersonRepository;
import org.neo4j.springframework.data.core.ReactiveNeo4jClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PersonService {


	private final PersonRepository personRepository;
	private final ReactiveNeo4jClient reactiveNeo4jClient;

	@Autowired
	public PersonService(PersonRepository personRepository, ReactiveNeo4jClient reactiveNeo4jClient) {
		this.personRepository = personRepository;
		this.reactiveNeo4jClient = reactiveNeo4jClient;
	}


	public Mono<Person> createPerson(String name, int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		this.reactiveNeo4jClient.query("MERGE (p:Person) " +
				"ON CREATE" +
				"SET name=$name" +
				"SET age=$age" +
				"RETURN p")
			.bind(person.getName()).to("name")
			.bind(person.getAge()).to("age").fetch()
			.one()
			.map((record) -> {
				person.setId((Long) record.get("id"));
				return person;
			});

		return null;

	}
}
