package com.korea.products.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="products")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private Long stock;
	private Long price;
	
	@CreationTimestamp//insert쿼리가 발생할 때 시간 값을 적용시켜준다.
	private LocalDateTime registerDate;//등록날짜
	
	@UpdateTimestamp //Update쿼리가 발생했을 때 시간 값을 적용시켜준다.
	//LocalDateTime.now():현재 시간을 저장
	private LocalDateTime updateDate;//수정날짜
	

}


















