package com.example.Antosha.service;

import com.example.Antosha.dto.DishDto;
import com.example.Antosha.model.Category;
import com.example.Antosha.model.Dish;
import com.example.Antosha.repository.CategoryRepository;
import com.example.Antosha.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DishService {
    private final DishRepository dishRepository;
    private final CategoryRepository categoryRepository;

    public List<DishDto> findAll(){
        return dishRepository.findAll().stream().map(dish -> new DishDto(
                dish.getId(), dish.getName(), dish.getCategory().getId(),
                dish.getCategory().getName(), dish.getDescription(),
                dish.getImage_path(), dish.getPrice()
        )).toList();
    }
    public Dish save(DishDto dishDto){
        return dishRepository.save(Dish.builder()
                        .name(dishDto.name())
                        .category(new Category(categoryRepository.findByName(dishDto.category_name()).orElse(new Category(100L, "Типо суши")).getId(),dishDto.category_name()))
                        .description(dishDto.description())
                        .image_path(dishDto.image_path())
                        .price(dishDto.price())
                .build());
    }
}
