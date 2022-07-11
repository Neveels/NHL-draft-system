package com.example.demo;

import com.example.demo.model.Player;
import com.example.demo.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(PlayerRepository playerRepository) {
//        return args -> {
//            Player player = new Player();
//            playerRepository.save(player);
//            playerRepository.delete(player);
//            playerRepository.save(player);
//        };
//    }
}
