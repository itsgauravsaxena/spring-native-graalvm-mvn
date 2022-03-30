package com.gauravsaxena.springnativegraalvmmvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class SpringNativeGraalvmMvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeGraalvmMvnApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes() {
		return route()
				.GET("/", request -> ok().body(Mono.just("Spring Native and Beyond!"), String.class))
				.build();
	}

}
