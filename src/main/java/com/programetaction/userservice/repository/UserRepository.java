package com.programetaction.userservice.repository;

import com.programetaction.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author JOSEPH WATZSON alias Joe Watson SBF (https://www.instagram.com/joe_watson_sbf)
 * @version 1.0
 * @since 27/07/2021
 * */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
