package aditya.Programmers_ReactiveNeo4j.domain;

import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NodeEntity
public class Person {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String userName;
	private int age;
	@Relationship(type = "LIKES")
	private List<Language> likes;
	@Relationship(type = "WORKS")
	private List<Language> works;
	@Relationship(type = "HATES")
	private List<Language> hates;

}