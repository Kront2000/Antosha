package com.example.Antosha.repository;

import com.example.Antosha.model.Dish;
import com.example.Antosha.service.CategoryService;
import com.example.Antosha.service.DishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private DishService dishService;


    @Test
    public void testGetMenu(){
        System.out.println(categoryService.getMenu());
    }

    @Test
    public void testRepo(){
        System.out.println(categoryRepository.findAll());
    }
    @Test
    public void testGetById(){
        System.out.println(dishService.findById(1L));
    }
}

