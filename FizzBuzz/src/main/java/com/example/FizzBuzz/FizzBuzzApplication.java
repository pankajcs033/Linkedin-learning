package com.example.FizzBuzz;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	@Bean
	public CommandLineRunner run(){
		return srgs -> {
			for(int i = 0; i < 101; i++){
				String str = "";
				if(i % 15 == 0){
					str += "FizzBuzz";
				}else if( i % 3 == 0){
					str += "Fizz";
				}else if(i % 5 == 0){
					str += "Buzz";
				}
				System.out.println(str.length() > 0 ? str : i);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
