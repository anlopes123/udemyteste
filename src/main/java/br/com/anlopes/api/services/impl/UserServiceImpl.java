package br.com.anlopes.api.services.impl;

import br.com.anlopes.api.domain.User;
import br.com.anlopes.api.exceptions.ObjectNotFoundException;
import br.com.anlopes.api.repositories.UserRepository;
import br.com.anlopes.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado no banco"));
    }
}
