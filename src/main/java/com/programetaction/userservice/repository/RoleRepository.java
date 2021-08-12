package com.programetaction.userservice.repository;


import com.programetaction.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author JOSEPH WATZSON alias Joe Watson SBF (https://www.instagram.com/joe_watson_sbf)
 * @version 1.0
 * @since 27/07/2021
 * */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
