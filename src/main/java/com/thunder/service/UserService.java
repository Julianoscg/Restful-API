package com.thunder.service;

import com.thunder.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
