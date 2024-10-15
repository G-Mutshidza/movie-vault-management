package com.movie.archive.movie_vault.service;

import com.movie.archive.movie_vault.model.User;
import com.movie.archive.movie_vault.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
