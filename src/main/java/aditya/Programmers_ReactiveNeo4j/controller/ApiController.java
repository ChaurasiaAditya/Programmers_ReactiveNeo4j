package aditya.Programmers_ReactiveNeo4j.controller;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import aditya.Programmers_ReactiveNeo4j.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
}
