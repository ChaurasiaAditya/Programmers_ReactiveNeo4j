package aditya.Programmers_ReactiveNeo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity

public class Company {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;

	@Relationship(type = "EMPLOYEES")
	private List<Person> employees;

	@Relationship(type = "USES")
	private List<Language> uses;
}
