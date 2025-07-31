package com.example.Antosha.service;

import com.example.Antosha.dto.CategoryDto;
import com.example.Antosha.model.Category;
import com.example.Antosha.repository.CategoryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class CategoryService {
    private final CategoryRepository repository;

    public List<CategoryDto> findAll(){
        return repository.findAll().stream()
                .map(category -> new CategoryDto(category.getId(), category.getName()))
                .toList();
    }
    public Category save(Category category){
        return repository.save(category);
    }
}
