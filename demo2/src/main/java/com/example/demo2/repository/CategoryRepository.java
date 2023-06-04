package com.example.demo2.repository;

import com.example.demo2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    @Query("SELECT r FROM Category r WHERE r.name = ?1")
    public Category findByName(String name);
}
