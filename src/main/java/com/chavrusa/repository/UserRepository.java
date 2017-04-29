package com.chavrusa.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chavrusa.io.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
