
package com.ifruitcommerce.ifruit;

import com.ifruitcommerce.ifruit.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // Usuários
        User user1 = new User(null, "John Doe", "john.doe@example.com", "123456789", "password1");
        User user2 = new User(null, "Jane Doe", "jane.doe@example.com", "987654321", "password2");
        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}

