package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody ProductDTO dto){
	    	ProductDTO updateDTO = service.updateProduct(id, dto);
	    	if(updateDTO != null) {
	    		return ResponseEntity.ok().body(updateDTO);
	    	}
	    	return ResponseEntity.badRequest().body("업데이트오류");
	    }
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteProduct(@PathVariable  Long id){
	    	boolean isDeleted = service.deleteProduct(id);
	    	
	    	if(isDeleted) {
	    		return ResponseEntity.ok("삭제성공");
	    	}
	    	return ResponseEntity.ok("삭제 실패" +id);
	    }
}






























