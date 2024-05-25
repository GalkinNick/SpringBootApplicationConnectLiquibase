package com.example.springbootapplication.services;

import com.example.springbootapplication.models.News;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;

@Service
public class FeedService implements CRUDServise<News>{

    private int MAX_LENGTH = 100;
    private TreeMap<Integer, News> feedNews = new TreeMap<>();

    @Override
    public News getById(Integer id) {
        if (!feedNews.containsKey(id)){
            throw new RuntimeException("New with ID " + id + "  not found");
        }

        return feedNews.get(id);

    }

    @Override
    public Collection<News> getAll() {
        return feedNews.values();
    }

    @Override
    public void create(News item) {
        int nextId = (feedNews.isEmpty() ? 0 : feedNews.lastKey()) + 1;
        item.setId(nextId);
         if (item.getTitle().length() > MAX_LENGTH) {
             throw new RuntimeException("Title is too long");
         }
        feedNews.put(nextId, item);
    }

    @Override
    public void update(Integer id, News item) {
        if (!feedNews.containsKey(id))
            return;

        if (item.getTitle().length() > MAX_LENGTH) {
            throw new RuntimeException("Title is too long");
        }

        item.setId(id);
        feedNews.put(id, item);
    }

    @Override
    public void delete(Integer id) {
        if (!feedNews.containsKey(id))
            return;

        feedNews.remove(id);
    }
}
