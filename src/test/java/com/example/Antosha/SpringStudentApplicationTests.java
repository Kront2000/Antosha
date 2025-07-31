package com.example.Antosha;

import com.example.Antosha.model.Category;
import com.example.Antosha.model.Dish;
import com.example.Antosha.repository.CategoryRepository;
import com.example.Antosha.repository.DishRepository;
import com.example.Antosha.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class SpringStudentApplicationTests {
    @Autowired
    private DishRepository dishRepository;
    @Autowired
    private CategoryRepository categoryRepository;

//    @Test
//    public void repositoryTest(){
//        System.out.println(categoryRepository.findByName("Суши").orElse(null));
//
////        Dish dish = Dish.builder()
////                .name("Шавуха")
////                .price(1200L)
////                .description("Ебать какая вкусная шувуха")
////                .image_path("/img/shavuha.png")
////                .category(categoryRepository.findByName("Суши").orElse(null))
////                .build();
////        System.out.println(dishRepository.save(dish));
//    }
}
