package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.User;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface UserRepository extends Repository<User, Integer> {
    List<User> findAll();
    User findOne(int id);
    User save(User p);
    void delete(User p);

}
