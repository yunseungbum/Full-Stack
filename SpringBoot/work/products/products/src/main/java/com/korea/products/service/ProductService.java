package com.korea.products.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.products.dto.ProductDTO;
import com.korea.products.model.ProductEntity;
import com.korea.products.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository repository;
	
	public List<ProductEntity> findAll(){
		return repository.findAll();
	}
	
	public List<ProductEntity> create(final ProductEntity entity) {
	    // Validations
	    validate(entity);

	    repository.save(entity);
	    return repository.findAll();
	}

	private void validate(final ProductEntity entity) {
	    if(entity == null) {
	        throw new RuntimeException("Entity cannot be null.");
	    }
	}
	


}
