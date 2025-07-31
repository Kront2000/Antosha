package com.example.Antosha.dto;

public record DishDto(Long id,
                      String name,
                      Long category_id,
                      String category_name,
                      String description,
                      String image_path,
                      Long price) {
}
