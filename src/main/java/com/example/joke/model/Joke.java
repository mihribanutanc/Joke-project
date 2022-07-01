package com.example.joke.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "joke")
@Data
public class Joke {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@JsonProperty("table_id")
	private int id;

	@JsonProperty("id")
	private int jokeId;

	private String category;

	private String type;

	private String joke;

	private String language;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flag_id")
	private Flag flags;

}
