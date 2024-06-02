package com.example.springbootapplication.repositories;

import com.example.springbootapplication.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepositories extends JpaRepository<News, Integer> {
}
