package com.example.user_list.repository;

import com.example.user_list.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository <User,Long> {
}
