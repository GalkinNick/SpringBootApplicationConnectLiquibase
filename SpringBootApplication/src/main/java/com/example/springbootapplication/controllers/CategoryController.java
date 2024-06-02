package com.example.springbootapplication.controllers;

import com.example.springbootapplication.dto.CategoryDto;
import com.example.springbootapplication.entity.Category;
import com.example.springbootapplication.services.CategoryServise;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryServise category;

    public CategoryController(CategoryServise categoryServise){
        this.category = categoryServise;
    }

    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable Integer id){
        return category.getById(id);
    }

    @GetMapping("/")
    public Collection<CategoryDto> getAll(){
        return category.getAll();
    }

    @PostMapping()
    public void create(@RequestBody CategoryDto item){
        category.create(item);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CategoryDto item){
        item.setId(id);
        category.update(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        category.delete(id);
    }


}
