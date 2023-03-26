package aditya.Programmers_ReactiveNeo4j.repository;

import aditya.Programmers_ReactiveNeo4j.domain.Language;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface LanguageRepository extends ReactiveNeo4jRepository<Language,Long> {
}
