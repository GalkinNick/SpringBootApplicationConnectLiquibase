package com.example.springbootapplication.controllers;

import com.example.springbootapplication.models.News;
import com.example.springbootapplication.services.FeedService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/news")
public class NewsController {
    private final FeedService news;

    public NewsController(FeedService news){
        this.news = news;
    }



    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Integer id){
        return news.getById(id);
    }

    @GetMapping("/")
    public Collection<News> getAllNews(){
        return news.getAll();
    }

    @PostMapping
    public void createNews(@RequestBody News item){
        news.create(item);
    }

    @PutMapping("/{id}")
    public void updateNews(@PathVariable Integer id,@RequestBody News item){
        news.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void deletenews(@PathVariable Integer id){
        news.delete(id);
    }

}
