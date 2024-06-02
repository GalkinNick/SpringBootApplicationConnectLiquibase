package com.example.springbootapplication.dto;

import com.example.springbootapplication.entity.News;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private Long id;
    private String title;
    private List<News> newsList;
}
