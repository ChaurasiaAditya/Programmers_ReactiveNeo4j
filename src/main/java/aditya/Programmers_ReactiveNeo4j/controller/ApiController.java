package aditya.Programmers_ReactiveNeo4j.controller;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class ApiController {

	private final PersonService personService;

	@PostMapping("/create")
	public Mono<Person> createPerson() {
		return personService.createPerson("sar");
	}

	@PostMapping("/create1")
	public ResponseEntity<?> createOne (@RequestBody String name) {
		return new ResponseEntity<>(this.personService.createOne(name), HttpStatus.CREATED);
	}







}
