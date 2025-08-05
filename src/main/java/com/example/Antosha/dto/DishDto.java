package com.example.Antosha.dto;

import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

@Builder
public record DishDto(Long id,
                      String name,
                      Long category_id,
                      String category_name,
                      String description,
                      String image_path,
                      Long price,
                      MultipartFile image) {
}
