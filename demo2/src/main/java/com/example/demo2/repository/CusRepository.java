package com.example.demo2.repository;

import com.example.demo2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CusRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT r FROM Customer r WHERE r.status = 0")
    List<Customer> listCus();
}
