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
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Integer age;
	@Relationship(type = "LIKES")
	private List<Language> likes;
	@Relationship(type = "WORKS")
	private List<Language> works;
	@Relationship(type = "HATES")
	private List<Language> hates;

}