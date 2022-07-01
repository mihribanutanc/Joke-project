package com.example.joke.api;

import com.example.joke.model.Joke;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public interface JokeApi {

	@Operation(operationId = "createJoke",summary = "Create Joke")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "SUCCESS",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "201", description = "Created",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "403", description = "Forbidden",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "404", description = "Not Found",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "405", description = "Method Not Allowed",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "409", description = "Conflict",
					content = @Content(schema = @Schema(implementation = Error.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error",
					content = @Content(schema = @Schema(implementation = Exception.class))) })
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Joke> saveJokeToDb();


	@Operation(operationId = "getJokeById",summary = "Get Joke to Db by id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "SUCCESS",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "201", description = "Created",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "403", description = "Forbidden",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "404", description = "Not Found",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "405", description = "Method Not Allowed",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "409", description = "Conflict",
					content = @Content(schema = @Schema(implementation = Error.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error",
					content = @Content(schema = @Schema(implementation = Exception.class))) })
	@GetMapping(name = "/{id}")
	ResponseEntity<Joke> getJokeToDbById(@PathVariable int id);




	@Operation(operationId = "getJokes",summary = "Get Joke pageable")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "SUCCESS",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "201", description = "Created",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "403", description = "Forbidden",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "404", description = "Not Found",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "405", description = "Method Not Allowed",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "409", description = "Conflict",
					content = @Content(schema = @Schema(implementation = Error.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error",
					content = @Content(schema = @Schema(implementation = Exception.class))) })
	@GetMapping("/pageable")
	Page<Joke> getJokePageable(@RequestParam int pageNumber, @RequestParam int pageSize);



	@Operation(operationId = "getJoke",summary = "Get joke ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "SUCCESS",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "201", description = "Created",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "403", description = "Forbidden",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "404", description = "Not Found",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "405", description = "Method Not Allowed",
					content = @Content(schema = @Schema(implementation = Exception.class))),
			@ApiResponse(responseCode = "409", description = "Conflict",
					content = @Content(schema = @Schema(implementation = Error.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error",
					content = @Content(schema = @Schema(implementation = Exception.class))) })
	@GetMapping("joke")
	public Joke getJoke();





}

