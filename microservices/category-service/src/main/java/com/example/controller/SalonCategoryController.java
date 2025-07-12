package com.example.controller;

import com.example.model.Category;
import com.example.payload.dto.SalonDto;
import com.example.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories/salon-owner")
@RequiredArgsConstructor
public class SalonCategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        SalonDto salonDto = new SalonDto();
        salonDto.setId(1L);
        Category createdCategory = categoryService.saveCategory(category, salonDto);
        return new ResponseEntity<>(createdCategory, HttpStatus.OK);
    }

    @DeleteMapping("/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable("categoryId") Long categoryId) {
        SalonDto salonDto = new SalonDto();
        salonDto.setId(1L);

        categoryService.deleteCategoryById(categoryId, salonDto.getId());
        return new ResponseEntity<>("Category Deleted!", HttpStatus.ACCEPTED);
    }

}
