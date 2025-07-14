package com.example.service.offering.service.controller;

import com.example.service.offering.service.model.ServiceOffering;
import com.example.service.offering.service.payload.dto.CategoryDto;
import com.example.service.offering.service.payload.dto.SalonDto;
import com.example.service.offering.service.payload.dto.ServiceOfferingDto;
import com.example.service.offering.service.service.ServiceOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service-offering/salon-owner")
@RequiredArgsConstructor
public class SalonServiceOfferingController {
    private final ServiceOfferingService serviceOfferingService;

    @PostMapping
    public ResponseEntity<ServiceOffering> createServiceOffering(
            @RequestBody ServiceOfferingDto serviceOfferingDto) {

        SalonDto salonDto = new SalonDto();
        salonDto.setId(1L);
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(1L);

        ServiceOffering serviceOffering = serviceOfferingService.createServiceOffering(salonDto, serviceOfferingDto, categoryDto);
        return new ResponseEntity<>(serviceOffering, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceOffering> updateServiceOffering(
            @PathVariable("id") Long id,
            @RequestBody ServiceOffering serviceOffering) {

        SalonDto salonDto = new SalonDto();
        salonDto.setId(1L);
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(1L);

        ServiceOffering updatedServiceOffering = serviceOfferingService.updateServiceOffering(id, serviceOffering);
        return new ResponseEntity<>(updatedServiceOffering, HttpStatus.OK);
    }

}
