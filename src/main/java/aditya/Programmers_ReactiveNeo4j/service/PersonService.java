package aditya.Programmers_ReactiveNeo4j.service;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class PersonService {

	private final PersonRepository personRepository;

	public Mono<Person> createPerson(String name) {
		return this.personRepository.createPerson(name);
	}
}
