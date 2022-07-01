package com.example.joke.service;

import com.example.joke.model.Joke;
import com.example.joke.repository.JokeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class JokeService {

	private final RestTemplate restTemplate;

	private final JokeRepository jokeRepository;

	public Joke savaJokeToDb() {

		ResponseEntity<Joke> response = restTemplate.getForEntity(
				"https://v2.jokeapi.dev/joke/Programming,Miscellaneous?blacklistFlags=nsfw,religious&type=single",
				Joke.class);

		return jokeRepository.save(response.getBody());
	}


	public Joke getJokeById(int id) {
		return jokeRepository.findById(id).orElseThrow();
	}

	public Page<Joke> getJokePageable(int size, int page) {
		Pageable pageable = PageRequest.of(size, page);
		return jokeRepository.findAll(pageable);
	}

	public Joke getJoke(){
		ResponseEntity<Joke> response = restTemplate.getForEntity(
				"https://v2.jokeapi.dev/joke/Any?type=single",
				Joke.class);

		return response.getBody();
	}

}
