package com.example.user_list.repository;

import com.example.user_list.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address,Long> {
}
