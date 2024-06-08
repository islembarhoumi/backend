package com.epi.cabinetsmedicaux.repository;

import com.epi.cabinetsmedicaux.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository  extends CrudRepository<User, Long> {








    User findByEmail(String email);











}

