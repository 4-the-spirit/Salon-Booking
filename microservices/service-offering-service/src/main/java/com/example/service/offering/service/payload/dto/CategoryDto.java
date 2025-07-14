package com.example.service.offering.service.payload.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CategoryDto {
    private Long id;

    private String name;

    private String image;
}
