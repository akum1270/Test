package com.aia.innovationCity.repository;

import com.aia.innovationCity.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData,Integer> {
    UserData findByUserNameAndPassword(String userName, String password);
}
