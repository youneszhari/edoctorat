package com.example.edoctorat.repositories;

import com.example.edoctorat.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
