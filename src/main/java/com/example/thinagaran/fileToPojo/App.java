package com.example.thinagaran.fileToPojo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("Start Process");
		ObjectMapper mapper = new ObjectMapper();
		Car car = mapper.readValue(new File("TestFile.txt"), Car.class);
		System.out.println(car.toString());

		List<User> user = mapper.readValue(new File("TestUserFile.txt"),
				new TypeReference<List<User>>() {});

		user.stream().forEach(u -> System.out.println(u.toString()));

	}
}
