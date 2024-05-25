package com.example.springbootapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class News {
    private int id;
    private String title;
    private String description;
    private Date date;
}
