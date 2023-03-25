package aditya.Programmers_ReactiveNeo4j.repository;

import aditya.Programmers_ReactiveNeo4j.domain.Person;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

public interface PersonRepository extends ReactiveNeo4jRepository<Person,Long> {


}
