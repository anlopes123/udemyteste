package br.com.anlopes.api.config;

import br.com.anlopes.api.domain.User;
import br.com.anlopes.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    public UserRepository repository;

    @Bean
    public void startDB() {


        User user1 = new User(null, "Anizair Lopes", "anlopes123@gmail.com", "123");
        User user2 = new User(null, "Maria Eduarda", "mariaeduarda@gmail.com", "124");

        repository.saveAll(List.of(user1, user2));

    }

}
