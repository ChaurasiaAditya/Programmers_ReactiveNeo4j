package aditya.Programmers_ReactiveNeo4j.controller;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class ApiController {

	private final PersonService personService;

	@PostMapping("/create")
	public Mono<Person> createPerson(String name, int age) {
		return personService.createPerson(name, age);
	}






}
