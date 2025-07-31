package com.example.Antosha.controller;


import com.example.Antosha.dto.DishDto;
import com.example.Antosha.model.Dish;
import com.example.Antosha.service.DishService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/dish")
public class DishController {
    private final DishService dishService;

    @GetMapping
    public List<DishDto> findAll(){
        return dishService.findAll();
    }

    @PostMapping("/add_dish")
    public Dish save(@RequestBody DishDto dishDto){
        return dishService.save(dishDto);
    }
}
