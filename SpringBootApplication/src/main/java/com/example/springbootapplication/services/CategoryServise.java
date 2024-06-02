package com.example.springbootapplication.services;

import com.example.springbootapplication.dto.CategoryDto;
import com.example.springbootapplication.entity.Category;
import com.example.springbootapplication.repositories.CategoryRepositories;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Slf4j
@Service
public class CategoryServise implements CRUDServise<CategoryDto>{

    private final CategoryRepositories repositoriesCategory;
    @Override
    public CategoryDto getById(Integer id) {
        log.info("Get by id " + id);

        Category category = repositoriesCategory.findById(id).orElseThrow();

        return mapToDto(category);
    }

    @Override
    public Collection<CategoryDto> getAll() {
        log.info("Get All");

        return repositoriesCategory.findAll()
                .stream()
                .map(CategoryServise::mapToDto)
                .toList();
    }

    @Override
    public void create(CategoryDto item) {
        log.info("Create");

        Category category = mapToEntity(item);

        repositoriesCategory.save(category);

    }

    @Override
    public void update(CategoryDto item) {
        log.info("Update");

        Category category = mapToEntity(item);

        repositoriesCategory.save(category);

    }

    @Override
    public void delete(Integer id) {
        log.info("Delete");
        repositoriesCategory.deleteById(id);
    }

    public static Category mapToEntity(CategoryDto categoryDto){
        Category category = new Category();

        category.setId(categoryDto.getId());
        category.setTitle(categoryDto.getTitle());
        category.setNewsList(categoryDto.getNewsList());

        return  category;

    }

    public  static CategoryDto mapToDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId(category.getId());
        categoryDto.setTitle(category.getTitle());
        categoryDto.setNewsList(category.getNewsList());

        return categoryDto;
    }
}
