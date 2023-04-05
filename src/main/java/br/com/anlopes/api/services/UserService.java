package br.com.anlopes.api.services;

import br.com.anlopes.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
