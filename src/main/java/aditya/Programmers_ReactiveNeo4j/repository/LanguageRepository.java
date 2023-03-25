package aditya.Programmers_ReactiveNeo4j.repository;

import aditya.Programmers_ReactiveNeo4j.domain.Language;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

public interface LanguageRepository extends ReactiveNeo4jRepository<Language,Long> {
}
