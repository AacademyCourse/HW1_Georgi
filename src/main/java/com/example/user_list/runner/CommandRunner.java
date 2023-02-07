package com.example.user_list.runner;

import com.example.user_list.entity.Address;
import com.example.user_list.entity.User;
import com.example.user_list.repository.AddressRepository;
import com.example.user_list.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.Instant;
@Component
public class CommandRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        createUser();
        createAddress();

    }

    public void createUser(){
        User user = new User();
        user.setFirst_name("Petar");
        user.setLast_name("Petrov");
        user.setPhone_number("1234");
        user.setEmail("p@p");
        user.setCreatedAt(Instant.now());

        User user1 = new User();
        user1.setFirst_name("Ivan");
        user1.setLast_name("Ivanov");
        user1.setPhone_number("5678");
        user1.setEmail("I@I");
        user1.setCreatedAt(Instant.now());

        userRepository.save(user);
        userRepository.save(user1);
    }
    public void createAddress(){
        Address address = new Address();
        address.setCountry("BG");
        address.setCity("Varna");
        address.setStreet("Slivnica");
        address.setStreet_number("14");

        Address address1 = new Address();
        address1.setCountry("BG");
        address1.setCity("Sofia");
        address1.setStreet("Vitosha");
        address1.setStreet_number("1");

        addressRepository.save(address);
        addressRepository.save(address1);
    }
}
