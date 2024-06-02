package com.example.springbootapplication.repositories;

import com.example.springbootapplication.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Integer> {
}
