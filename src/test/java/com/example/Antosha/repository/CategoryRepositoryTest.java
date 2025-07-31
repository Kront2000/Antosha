package com.example.Antosha.repository;

import com.example.Antosha.model.Dish;
import com.example.Antosha.service.DishService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DishRepository dishRepository;
    @Autowired
    private DishService dishService;

    @Test
    public void repositorySaveTest(){

        Dish dish = Dish.builder()
                .name("Шавуха")
                .price(1200L)
                .description("Ебать какая вкусная шувуха")
                .image_path("/static/img/shavuha.png")
                .category(categoryRepository.findByName("Суши").orElse(null))
                .build();
        System.out.println(dishRepository.save(dish));
    }
    @Test
    public void repositoryFindAll(){
        for(Dish dish: dishRepository.findAll()){
            System.out.println(dish);
        }
    }

    @Test
    public void testSaveDish() {
        System.out.println(dishRepository.findAll().get(0).getCategory());

    }
    @Test
    public void testServiceDish(){
        System.out.println(dishService.findAll());
    }
}

