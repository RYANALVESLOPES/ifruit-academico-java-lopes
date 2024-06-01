package com.ifruitcommerce.ifruit;

import com.ifruitcommerce.ifruit.entities.User;

import java.util.List;

public interface UserRepository {
    void saveAll (List<User> list);
}
