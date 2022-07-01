package com.example.joke.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "flag")
public class Flag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private boolean nsfw;

	private boolean religious;

	private boolean political;

	private boolean racist;

	private boolean sexist;

	private boolean explicit;

}
