package com.korea.products.dto;

import java.time.LocalDateTime;

import com.korea.products.model.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	private Long id;
	private String name;
	private Long stock;
	private Long price;
	private LocalDateTime registerDate;
	private LocalDateTime updateDate;
	
	//Entity -> DTO
	public ProductDTO(ProductEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.stock = entity.getStock();
		this.price = entity.getPrice();
		this.registerDate = entity.getRegisterDate();
		this.updateDate = entity.getUpdateDate();
		
	}
	
	//DTO -> Entity
	public static ProductEntity toEntity(ProductDTO dto) {
		
		return ProductEntity.builder()
							.id(dto.getId())
							.name(dto.getName())
							.stock(dto.getStock())
							.price(dto.getPrice())
							.registerDate(dto.getRegisterDate())
							.updateDate(dto.getUpdateDate())
							.build();
	}

}
