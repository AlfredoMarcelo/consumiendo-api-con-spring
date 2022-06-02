package cl.aiep.java.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)//con esto evitamos errorer con keys que no queremos o que no funcinen
public class Usuario {

	private Long id;
	@JsonProperty("name")//con esta anotacion se hacer referencia a la key original de la api, pero abajo el atributo que la reemplaza name=nombre
	private String nombre;
	private String username;
	private String email;
	@JsonProperty("phone")
	private String telefono;
	private String website;
	@JsonProperty("address")
	private Direccion direccion;
}
