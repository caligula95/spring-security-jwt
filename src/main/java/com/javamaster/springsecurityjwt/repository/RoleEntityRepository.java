package com.javamaster.springsecurityjwt.repository;

import com.javamaster.springsecurityjwt.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Integer> {

    RoleEntity findByName(String name);
}
