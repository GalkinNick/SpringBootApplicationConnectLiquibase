package com.example.springbootapplication.controllers;

import com.example.springbootapplication.dto.NewsDto;
import com.example.springbootapplication.services.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/news")
public class NewsController {
    private final NewsService news;

    public NewsController(NewsService news){
        this.news = news;
    }

    @GetMapping("/{id}")
    public NewsDto getNewsById(@PathVariable Integer id){
        return news.getById(id);
    }

    @GetMapping("/")
    public Collection<NewsDto> getAllNews(){
        return news.getAll();
    }

    @PostMapping
    public void createNews(@RequestBody NewsDto item){
        news.create(item);
    }

    @PutMapping("/{id}")
    public void updateNews(@PathVariable Integer id,@RequestBody NewsDto item){
        item.setId(id);
        news.update(item);
    }

    @DeleteMapping("/{id}")
    public void deletenews(@PathVariable Integer id){
        news.delete(id);
    }

}
