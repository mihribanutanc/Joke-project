package com.example.joke.controller;

import com.example.joke.api.JokeApi;
import com.example.joke.model.Joke;
import com.example.joke.service.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jokes")
@AllArgsConstructor
public class JokeController implements JokeApi {

	private final JokeService jokeService;


	@Override
	public ResponseEntity<Joke> saveJokeToDb() {
		return ResponseEntity.ok(jokeService.savaJokeToDb());
	}

	@Override
	public ResponseEntity<Joke> getJokeToDbById(int id) {
		return ResponseEntity.ok(jokeService.getJokeById(id));
	}

	@Override
	public Page<Joke> getJokePageable(int pageNumber, int pageSize) {
		return jokeService.getJokePageable(pageNumber,pageSize);
	}

	@Override
	public Joke getJoke() {
		return jokeService.getJoke();
	}
}
