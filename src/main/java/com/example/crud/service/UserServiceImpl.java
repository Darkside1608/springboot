package com.example.crud.service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;


    @Service
    public class UserServiceImpl implements UserService {

        private final UserRepository userRepository;

        @Autowired
        public UserServiceImpl(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @Override
        public User getUserById(Long id) {
            return userRepository.getById(id);
        }

        @Override
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        @Override
        @Transactional
        public void saveUser(User user) {
            userRepository.saveAndFlush(user);
        }

        @Override
        @Transactional
        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
    }

