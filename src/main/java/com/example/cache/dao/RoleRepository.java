package com.example.cache.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cache.entities.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
