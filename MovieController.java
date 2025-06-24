package com.moviebooking.controller;

import com.moviebooking.model.Movie;
import com.moviebooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Movie add(@RequestBody Movie movie) {
        return service.add(movie);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }
}
