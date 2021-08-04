package com.ravali.entity.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ravali.entity.UserEntity4;

public interface UserRepository extends JpaRepository<UserEntity4, Serializable>{
}
