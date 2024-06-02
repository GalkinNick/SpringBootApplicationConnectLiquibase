package com.example.springbootapplication.services;

import com.example.springbootapplication.dto.NewsDto;
import com.example.springbootapplication.entity.News;
import com.example.springbootapplication.repositories.NewsRepositories;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
@RequiredArgsConstructor
@Slf4j
@Service
public class NewsService implements CRUDServise<NewsDto>{

    private int MAX_LENGTH = 100;
    //private TreeMap<Integer, NewsDto> feedNews = new TreeMap<>();
    private final NewsRepositories repositoriesNews;



    @Override
    public NewsDto getById(Integer id) {
        log.info("Get by id " + id);
        News news = repositoriesNews.findById(id).orElseThrow();
        return mapToDto(news);

    }

    @Override
    public Collection<NewsDto> getAll() {
        log.info("Get all");
        return repositoriesNews.findAll()
                .stream()
                .map(NewsService::mapToDto)
                .toList();
    }

    @Override
    public void create(NewsDto item) {
        log.info("Create item");

        News news = mapToEntity(item);

        repositoriesNews.save(news);

        if (item.getTitle().length() > MAX_LENGTH){
            throw  new RuntimeException("Comment is too long");
        }

    }

    @Override
    public void update(NewsDto item) {
        log.info("Update item");
        News news = mapToEntity(item);

        repositoriesNews.save(news);

        if (item.getTitle().length() > MAX_LENGTH){
            throw  new RuntimeException("Comment is too long");
        }
    }

    @Override
    public void delete(Integer id) {

        log.info("Delete item");
        repositoriesNews.deleteById(id);
    }



    public static News mapToEntity(NewsDto newsDto){
        News news = new News();
        news.setId(newsDto.getId());
        news.setTitle(newsDto.getTitle());
        news.setDescription(newsDto.getDescription());
        news.setCategory(newsDto.getCategory());
        news.setDate(newsDto.getDate());
        return news;
    }

    public static NewsDto mapToDto(News news){
        NewsDto newsDto = new NewsDto();
        newsDto.setId(news.getId());
        newsDto.setTitle(news.getTitle());
        newsDto.setDescription(news.getDescription());
        newsDto.setCategory(news.getCategory());
        newsDto.setDate(news.getDate());

        return newsDto;
    }
}
