package com.korea.product.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.presistence.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository repository;
	
	public ProductDTO addProduct(ProductDTO productDTO){
		ProductEntity entity = ProductDTO.toEntity(productDTO);	
		return new ProductDTO(repository.save(entity));
	}
	public List<ProductDTO> getFilteredProducts(Double minPrice,String name) {
		
		List<ProductEntity> products = repository.findAll();
		
		//가격 필터림(최소금액이 주어진 경우)
		 if(minPrice != null) {
			 products = products.stream()
					 .filter(product -> product.getPrice() >= minPrice)
					 .collect(Collectors.toList());
		 }
		//이름 필터링(name이 넘어왔을 경우)
		 if(name != null && name.isEmpty()) {
			 products = products.stream()
					 	.filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
					 	.collect(Collectors.toList());
			 
		 }
		 return products.stream().map(ProductDTO::new ).collect(Collectors.toList());
	}
	
	public ProductDTO updateProduct(Long id, ProductDTO dto){
		
		//db에서 id에 해당하는 데이터가 있는지 조회
		Optional<ProductEntity> orginal =  repository.findById(id);
		
		//있으면 매개변수로 넘어온 dto에 있는 내용으로 기존의 내용을 갱신
		if(orginal.isPresent()) {
			ProductEntity entity = orginal.get();
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			System.out.println(dto.getPrice());
			entity.setPrice(dto.getPrice());
			repository.save(entity);
			return new ProductDTO(entity);
		}
		return null;
		
	}
	
	public Boolean deleteProduct(Long id) {
		Optional<ProductEntity> original =  repository.findById(id);
		if(original.isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
	
	
	
	

}
