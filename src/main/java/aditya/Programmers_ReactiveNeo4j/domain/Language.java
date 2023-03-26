package aditya.Programmers_ReactiveNeo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity
public class Language {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@Relationship(type = "CREATED_BY")
	private Person createdBy;

	@Relationship(type = "MANAGED_BY")
	private Company managedBy;
}
