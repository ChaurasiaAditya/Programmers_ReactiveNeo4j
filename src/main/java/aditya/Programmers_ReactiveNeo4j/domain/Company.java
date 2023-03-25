package aditya.Programmers_ReactiveNeo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

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
