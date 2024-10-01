package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.presistence.ProductRepository;
import com.korea.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService service;
		
		@PostMapping
		public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto){
			ProductDTO createProduct = service.addProduct(dto);
			return ResponseEntity.ok().body(createProduct);
		}
		
	    
	    @GetMapping
	    public ResponseEntity<List<ProductDTO>> getFilteredProducts(
	            @RequestParam(required = false) Double minPrice, 
	            @RequestParam(required = false) String name) {
	        
	        List<ProductDTO> products = service.getFilteredProducts(minPrice, name);
	        return ResponseEntity.ok().body(products);
	    }
	    
	    @PutMapping
	    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO dto){
	    	ProductEntity entity = ProductDTO.toEntity(dto);
	    	List<ProductDTO> updateProduct = service.updateProduct(entity);
	    	return ResponseEntity.ok().body(updateProduct);
	    	
	    }
}






























