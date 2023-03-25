package aditya.Programmers_ReactiveNeo4j.repository;

import aditya.Programmers_ReactiveNeo4j.domain.Company;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

public interface CompanyRepository extends ReactiveNeo4jRepository<Company,Long> {
}
