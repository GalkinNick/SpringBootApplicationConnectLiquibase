package com.example.springbootapplication.dto;


import com.example.springbootapplication.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class NewsDto {
    private int id;
    private String title;
    private String description;
    private LocalDateTime date;
    private Category category;
}
