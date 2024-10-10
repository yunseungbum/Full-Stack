package com.korea.products.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.korea.products.dto.ProductDTO;
import com.korea.products.dto.ResponseDTO;
import com.korea.products.model.ProductEntity;
import com.korea.products.service.ProductService;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductController {
	
	private final ProductService service;
	
	@GetMapping
	public ResponseEntity<?> productList(){
		List<ProductEntity> entities = service.findAll();
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		
		try {
			ProductEntity entity = ProductDTO.toEntity(dto);
			List<ProductEntity> entites = service.create(entity);
			List<ProductDTO> dtos = entites.stream().map(ProductDTO::new).collect(Collectors.toList());
			ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
		
		
		
	}
	
	 

}
