package com.aia.innovationCity.repository;

import com.aia.innovationCity.entity.City;
import com.aia.innovationCity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRoleId(int roleId);

    Role findByIsDefault(int value);
}
