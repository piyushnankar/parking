package com.piyush.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piyush.parking.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
